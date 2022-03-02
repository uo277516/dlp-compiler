grammar Xana;


@header {
package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.Program;
}



program returns [Program ast]
    : (v+=varDef | funDefs+=funDef)* funMain {
        List<FunDef> funDefs = new ArrayList<>();
        List<VarDef> varDefs = new ArrayList<>();

        for (var varDef1: $v) {
            for (var varDef2: varDef1.ast) {
                varDefs.add(varDef2);
            }
        }
        if ($funMain.ast!=null)
            funDefs.add($funMain.ast);

        $ast = new Program(varDefs, funDefs, $start.getLine(), $start.getCharPositionInLine() + 1);
      }
    ;



//-----funciones---


//para la main crear una regla aparte que para las definiciones
//de funciones
funDef returns [FunDef ast]
    : 'def' id=ID '(' parameterList ')' '::' returnType 'do'
            (v+=varDef|statements+=statement)* //cuerpo
          'end' {
            List<Statemment> sts = new ArrayList<>();
            List<VarDef> varDefs = new ArrayList<>();

            for (var varDef1: $v) {
                 for (var varDef2: varDef1.ast) {
                      varDefs.add(varDef2);
                 }
            }

            for (var s: $statements) {
                sts.add(s.ast);
            }
            $ast = new FunDef(varDefs, sts, $id.text, $returnType.ast,
                       $start.getLine(), $start.getCharPositionInLine() + 1);

          }
    ;

returnType returns [Type ast]
    : simple_type   {$ast = $simple_type.ast; }
    | 'void'        {$ast = new VoidType($start.getLine(), $start.getCharPositionInLine() + 1); }
    ;


funMain returns [FunMain ast]
    : 'def' 'main' '(' ')' 'do' (v+=varDef|sts+=statement)* 'end'
    {
                List<Statemment> sts = new ArrayList<>();
                List<VarDef> varDefs = new ArrayList<>();
                for (var s: $sts) {
                    sts.add(s.ast);
                }
                for (var varDef1: $v) {
                     for (var varDef2: varDef1.ast) {
                        varDefs.add(varDef2);
                     }
                }
                $ast = new FunMain(varDefs, sts, null, null,
                       $start.getLine(), $start.getCharPositionInLine() + 1);


              }
    ;


//funBody: (varDef|statement)*;

//parámetros de la lista
parameterList: param? (','param)*
    ;

param: ID '::' type
    ;



//--expresiones
expression returns [Expression ast]
    : INT_CONSTANT  //mirar ast
    | REAL_CONSTANT
    | CHAR_CONSTANT
    | ID
    | expression '(' listExpressions ')' //invocacion
    | expression '[' expression ']' //array access
    | expression '.' expression //funcion access
    | expression 'as' simple_type //cast
    | '!' expression //unary minus
    | '-' expression //unary minus
    | expression operatorMultiply expression //multiplicar
    | expression operatorArithmetic expression //arithmetic
    | expression('<'|'>'|'<='|'>='|'!='|'==')expression
    | expression operatorLogical expression
    | '(' expression ')'
    ;

operatorLogical: '&&'
                 | '||'
                 ;

operatorArithmetic: '+'
                    | '-'
                    ;

operatorMultiply: | '/'
                  | '*'
                  | '%'
    ;

listExpressions: expression? (',' expression)*
    ;





//statements
statement returns [Statemment ast]
        : 'puts' exps+=expression (','exps+=expression)*  //write
            {
                List<Expression> expressions = new ArrayList<>();
                for (var e: $exps) {
                    expressions.add(e.ast);
                }
                $ast = new Write($start.getLine(), $start.getCharPositionInLine() + 1, expressions);
            }
        | 'in' expression (','expression)*  //read
        | expression '=' expression //asignacion
        | 'if' expression+ 'do'   //if
             (expression|statement)*
          ('else'(expression|statement)*)?
        'end'
        | 'while' expression+ 'do'  //while
           (expression|statement)*
        'end'
        | 'return' expression  //return
        | expression '(' listExpressions ')' //invocacion por statement
    ;











//-------variables--------

varDef returns [List<VarDef> ast = new ArrayList<>()]
    : ids+=ID (','ids+=ID)* '::' type {
        for(var id : $ids) {
            $ast.add(new VarDef(id.getLine(), id.getCharPositionInLine() + 1, id.getText(), $type.ast));
        }
    }
    ;

type returns [Type ast]
    : simple_type { $ast = $simple_type.ast; }
    | complex_type { $ast = $complex_type.ast; }
        ;

complex_type returns [Type ast]
    : array    { $ast = $array.ast; }
    | struct   { $ast = $struct.ast; }
    ;

simple_type returns [Type ast]
    : 'int'    { $ast = new IntType($start.getLine(), $start.getCharPositionInLine() + 1); }
    | 'double' { $ast = new RealType($start.getLine(), $start.getCharPositionInLine() + 1); }
    | 'char'   { $ast = new CharType($start.getLine(), $start.getCharPositionInLine() + 1); }
    ;


array returns [Type ast]
    : '[' INT_CONSTANT '::' type ']' {
        $ast = new ArrayType($start.getLine(), $start.getCharPositionInLine() + 1, $type.ast);
        }
    ;


struct returns [Type ast]
    : 'defstruct' 'do' r+=recordFields* 'end' {
                    List<VarDef> varDefs = new ArrayList<>();

                            for (var varDef1: $r) {
                                for (var varDef2: varDef1.ast) {
                                    varDefs.add(varDef2);
                                }
                            }
                    $ast = new StructType ($start.getLine(), $start.getCharPositionInLine() + 1, varDefs);
                }
    ;

//para el cuerpo del struct
recordFields returns [List<VarDef> ast = new ArrayList<>()]
    : ids+=ID (','ids+=ID)* '::' type
    {
        for(var id : $ids) {
            $ast.add(new VarDef(id.getLine(), id.getCharPositionInLine() + 1, id.getText(), $type.ast));
        }
    }
    ;



//----------TOKENS----------

BASURA : [ \t\r\n]+ -> skip;

INT_CONSTANT: '0'|[1-9]DIGIT*
            ;

ID: (LETTER|'_')(ID_BODY)*
    ;

REAL_CONSTANT:  REAL_CONSTANT_DECIMAL
                |
               REAL_CONSTANT_EXP
            ;

ONELINE_COMMENT: '#' .*? ('\n'|EOF) -> skip
        ;

LINES_COMMENT : ('"""') .*? ('"""') -> skip
    ;

CHAR_CONSTANT : '\'' (.|ASCI|CHAR_ESPECIAL) '\''
        ;


fragment
ASCI: ('\\')(ASCI_1|ASCI_2)
    ;

fragment
ASCI_1 : [0-9][0-9]
        ;

fragment
ASCI_2 : ([1][0-9][0-9])|([2][0-5][0-5])
        ;


fragment
CHAR_ESPECIAL : '\\''t' | '\\''n'
        ;


fragment
ID_BODY : (LETTER|DIGIT|'_')
         ;

fragment
DIGIT_POS : [1-9]+ ;

fragment
REAL_CONSTANT_DECIMAL: (INT_CONSTANT'.'INT_CONSTANT)|('.'INT_CONSTANT)|(INT_CONSTANT'.')
            ;
fragment
REAL_CONSTANT_EXP: ((REAL_CONSTANT_DECIMAL'E'[+-]EXPOS)
                                       |
                   ((DIGITS|REAL_CONSTANT_DECIMAL)'e'EXPOS))
              ;

fragment
DIGIT: [0-9]
    ;

fragment
DIGITS: [0-9]+
       ;

fragment
EXPOS : [1-9][0-9]*
    ;

fragment
LETTER: [a-zA-Z]
    ;

