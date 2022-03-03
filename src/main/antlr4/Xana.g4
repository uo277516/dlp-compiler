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
    : i=INT_CONSTANT
        {$ast = new IntLiteral($start.getLine(), $start.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($i.text)); }
    | r=REAL_CONSTANT
         {$ast = new RealLiteral($start.getLine(), $start.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($r.text)); }
    | c=CHAR_CONSTANT
         {$ast = new CharLiteral($start.getLine(), $start.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($c.text)); }
    | id=ID
         {$ast = new Variable($start.getLine(), $start.getCharPositionInLine() + 1, $id.text); }
    | e=expression '(' listExpressions ')' //invocacion
         {
         $ast = new Invocation($start.getLine(), $start.getCharPositionInLine() + 1,
                             $e.ast, $listExpressions.ast);
         }
    | a=expression '[' index=expression ']' //array access
        {
         $ast = new ArrayAccess($start.getLine(), $start.getCharPositionInLine() + 1,
            $a.ast, $index.ast);
        }
    | e1=expression '.' e2=expression //funcion access
        {
        $ast = new FileAccess($e1.ast, $e2.ast, $start.getLine(), $start.getCharPositionInLine() + 1);
        }
    | e=expression 'as' s=simple_type //cast
        {
        $ast = new Cast($start.getLine(), $start.getCharPositionInLine() + 1,
            $e.ast, $s.ast);
        }
    | '!' e=expression //unary not
        {
        $ast = new UnaryNot($start.getLine(), $start.getCharPositionInLine() + 1, $e.ast);
        }
    | '-' e=expression //unary minus
         {
         $ast = new UnaryMinus($start.getLine(), $start.getCharPositionInLine() + 1, $e.ast);
         }
    | e1=expression op=operatorMultiply e2=expression //multiplicar
        {
        $ast = new ArithmeticMultiply($e1.ast, $op.ast, $e2.ast,
            $start.getLine(), $start.getCharPositionInLine() + 1);
        }
    | e1=expression op1=operatorArithmetic e2=expression //arithmetic
        {
        $ast = new Arithmetic($e1.ast, $op1.ast, $e2.ast,
             $start.getLine(), $start.getCharPositionInLine() + 1);
        }
    | e1=expression op2=('<'|'>'|'<='|'>='|'!='|'==') e2=expression
        {
        $ast = new Comparator($e1.ast, $op2.text, $e2.ast,
                     $start.getLine(), $start.getCharPositionInLine() + 1);
        }
    | e1=expression op3=operatorLogical e2=expression
        {
        $ast = new Logical($e1.ast, $op3.ast, $e2.ast,
                     $start.getLine(), $start.getCharPositionInLine() + 1);
        }
    | '(' expression ')'
        {
        $ast = $expression.ast;
        }
    ;

operatorLogical returns [String ast]
                 : a='&&' {$ast = $a.text;}
                 | o='||'   {$ast = $o.text;}
                 ;

operatorArithmetic returns [String ast]
                    : m='+'  {$ast = $m.text;}
                    | mi='-' {$ast = $mi.text;}
                    ;

operatorMultiply returns [String ast]
                  : | d='/' {$ast = $d.text;}
                  | m='*'   {$ast = $m.text;}
                  | p='%'   {$ast = $p.text;}
    ;

listExpressions returns [List<Expression> ast = new ArrayList<>()]
    : exps+=expression? (',' exps+=expression)*
        {
            for (var e: $exps)
            {
                $ast.add(e.ast);
            }
        }
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
        | 'in' exps+=expression (','exps+=expression)*  //read
            {
                List<Expression> expressions = new ArrayList<>();
                for (var e: $exps) {
                    expressions.add(e.ast);
                }
                $ast = new Read($start.getLine(), $start.getCharPositionInLine() + 1, expressions);
            }
        | e1=expression '=' e2=expression //asignacion
            {
                $ast = new Assigment($start.getLine(), $start.getCharPositionInLine() + 1, $e1.ast, $e2.ast);
            }
        | 'if' condiciones+=expression+ 'do'   //if
             (ifExps+=expression|ifSts+=statement)*
          ('else'(elseExps+=expression|elseSts+=statement)*)?
        'end'
            {
                List<Expression> condiciones = new ArrayList<>();
                List<Expression> ifExps = new ArrayList<>();
                List<Statemment> ifSts= new ArrayList<>();
                List<Expression> elseExps= new ArrayList<>();
                List<Statemment> elseSts= new ArrayList<>();

                for (var c: $condiciones) {condiciones.add(c.ast);}
                for (var c: $ifExps) {ifExps.add(c.ast);}
                for (var c: $ifSts) {ifSts.add(c.ast);}
                for (var c: $elseExps) {elseExps.add(c.ast);}
                for (var c: $elseSts) {elseSts.add(c.ast);}

                $ast = new IfElse(condiciones, ifExps, ifSts, elseExps, elseSts, $start.getLine(), $start.getCharPositionInLine() + 1);
            }
        | 'while' condiciones+=expression+ 'do'  //while
           (exps+=expression|sts+=statement)*
            {
                List<Expression> condiciones = new ArrayList<>();
                List<Expression> exps = new ArrayList<>();
                List<Statemment> sts= new ArrayList<>();

                for (var c: $condiciones) {condiciones.add(c.ast);}
                for (var c: $exps) {exps.add(c.ast);}
                for (var c: $sts) {sts.add(c.ast);}

                $ast = new While(condiciones, exps, sts, $start.getLine(), $start.getCharPositionInLine() + 1);
            }
        'end'
        | 'return' expression  //return
            {
                $ast = new Return($expression.ast, $start.getLine(), $start.getCharPositionInLine() + 1);
            }
        | expression '(' listExpressions ')' //invocacion por statement
            {

                $ast = new InvocationStatement($start.getLine(), $start.getCharPositionInLine() + 1,
                    $expression.ast, $listExpressions.ast);
            }
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

