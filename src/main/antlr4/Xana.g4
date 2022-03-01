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
    : (varDefs+=varDef | funDefs+=funDef)* funMain {
        List<VarDef> varDefs = new ArrayList<>();
        List<FunDef> funcDefs = new ArrayList<>();

        for(var def: $varDefs) {
            varDefs.add(def.ast);
        }
        for(var def: $funDefs) {
            funcDefs.add(def.ast);
        }

        funDefs.add($funMain.ast);

        $ast = new Program(varDefs, funDefs, $start.getLine(), $start.getCharPositionInLine() + 1);
      }
    ;



//-----funciones---


//para la main crear una regla aparte que para las definiciones
//de funciones
funDef returns [FunDef ast]
    : 'def' id=ID '(' parameterList ')' '::' returnType 'do'
            (varDefs+=varDef|statements+=statement)* //cuerpo
          'end' {
            List<VarDef> varDefs = new ArrayList<>();
            List<Statemment> sts = new ArrayList<>();
            for (var vardef: $varDefs) {
                varDefs.add(vardef.ast);
            }
            for (var s: $statements) {
                sts.add(s.ast);
            }
            $ast = new FunDef(varDefs, sts, $id.text, $returnType.ast);
          }
    ;

returnType returns [Type ast]
    : simple_type   {$ast = $simple_type.ast; }
    | 'void'        {$ast = new VoidType($start.getLine(), $start.getCharPositionInLine() + 1); }
    ;


funMain returns [FunMain ast]
    : 'def' 'main' '(' ')' 'do' (varDef|statement)* 'end'
    ;


//funBody: (varDef|statement)*;

//parámetros de la lista
parameterList: param? (','param)*
    ;

param: ID '::' type
    ;



//--expresiones
expression: INT_CONSTANT  //mirar ast
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
statement: 'puts' expression (','expression)*  //read
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

varDef: ID (','ID)* '::' type
    ;

type: simple_type
    | complex_type
        ;

complex_type: array
    | struct
    ;

simple_type returns [Type ast]
    : 'int'    { $ast = new IntType($start.getLine(), $start.getCharPositionInLine() + 1); }
    | 'double' { $ast = new RealType($start.getLine(), $start.getCharPositionInLine() + 1); }
    | 'char'   { $ast = new CharType($start.getLine(), $start.getCharPositionInLine() + 1); }
    ;


array: '[' INT_CONSTANT '::' type ']'
    ;


struct: 'defstruct' 'do' recordFields* 'end'
    ;

//para el cuerpo del struct
recordFields: ID (','ID)* '::' type

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

