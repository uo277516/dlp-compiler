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
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.ErrorManager;
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

        for (var fundef: $funDefs) {
            funDefs.add(fundef.ast);
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
                for (var s2: s.ast) {
                    sts.add(s2);
                }
            }
            $ast = new FunDef(varDefs, sts, $id.text, new FunType($parameterList.ast, $returnType.ast, $start.getLine(), $start.getCharPositionInLine() + 1),
                       $start.getLine(), $start.getCharPositionInLine() + 1);

          }
    ;

returnType returns [Type ast]
    : simple_type   {$ast = $simple_type.ast; }
    | 'void'        {$ast = new VoidType($start.getLine(), $start.getCharPositionInLine() + 1); }
    ;


funMain returns [FunDef ast]
    : 'def' 'main' '(' ')' 'do' (v+=varDef|sts+=statement)* 'end'
    {
                List<Statemment> sts = new ArrayList<>();
                List<VarDef> varDefs = new ArrayList<>();
                for (var s: $sts) {
                     for (var s2: s.ast) {
                          sts.add(s2);
                     }
                }
                for (var varDef1: $v) {
                     for (var varDef2: varDef1.ast) {
                        varDefs.add(varDef2);
                     }
                }

                VoidType tipo = new VoidType($start.getLine(), $start.getCharPositionInLine() + 1);
                FunType ft = new FunType(new ArrayList<VarDef>(), tipo, $start.getLine(), $start.getCharPositionInLine() + 1);
                $ast = new FunDef(varDefs, sts, "main", ft, $start.getLine(), $start.getCharPositionInLine() + 1);

              }
    ;


//funBody: (varDef|statement)*;

//parámetros de la lista
parameterList returns [List<VarDef> ast = new ArrayList<>()]
    : params+=param? (','params+=param)*
    {
        for(var p: $params)
        {
            $ast.add(p.ast);
        }
    }
    ;

param returns [VarDef ast]
    : id=ID '::' t=type {$ast = new VarDef($start.getLine(), $start.getCharPositionInLine() + 1, $id.text, $t.ast);}
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
    | e1=expression '.' id=ID //funcion access
        {
        $ast = new FileAccess($e1.ast, $id.text, $start.getLine(), $start.getCharPositionInLine() + 1);
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
    | e1=expression op=('*'|'/'|'%') e2=expression //multiplicar
        {
        $ast = new ArithmeticMultiply($e1.ast, $op.text, $e2.ast,
            $start.getLine(), $start.getCharPositionInLine() + 1);
        }
    | e1=expression op1=('+'|'-') e2=expression //arithmetic
        {
        $ast = new Arithmetic($e1.ast, $op1.text, $e2.ast,
             $start.getLine(), $start.getCharPositionInLine() + 1);
        }
    | e1=expression op2=('<'|'>'|'<='|'>='|'!='|'==') e2=expression
        {
        $ast = new Comparator($e1.ast, $op2.text, $e2.ast,
                     $start.getLine(), $start.getCharPositionInLine() + 1);
        }
    | e1=expression op3=('&&'|'||') e2=expression
        {
        $ast = new Logical($e1.ast, $op3.text, $e2.ast,
                     $start.getLine(), $start.getCharPositionInLine() + 1);
        }
    | '(' expression ')'
        {
        $ast = $expression.ast;
        }
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
statement returns [List<Statemment> ast = new ArrayList<>()]
        : 'puts' exps+=expression (','exps+=expression)*  //write
            {

                for (var e: $exps) {
                    $ast.add(new Write($start.getLine(), $start.getCharPositionInLine() + 1, e.ast));
                }

            }
        | 'in' exps+=expression (','exps+=expression)*  //read
            {

                for (var e: $exps) {
                   $ast.add(new Read($start.getLine(), $start.getCharPositionInLine() + 1, e.ast));
                }

            }
        | e1=expression '=' e2=expression //asignacion
            {
                $ast.add(new Assigment($start.getLine(), $start.getCharPositionInLine() + 1, $e1.ast, $e2.ast));
            }
        | 'if' condiciones+=expression+ 'do'   //if
             (ifSts+=statement)*
          ('else'(elseSts+=statement)*)?
        'end'
            {
                List<Expression> condiciones = new ArrayList<>();
                List<Statemment> ifSts= new ArrayList<>();
                List<Statemment> elseSts= new ArrayList<>();

                for (var c: $condiciones) {condiciones.add(c.ast);}
                for (var s: $ifSts) {
                                for (var s2: s.ast) {
                                    ifSts.add(s2);
                                }
                            }
                for (var s: $elseSts) {
                                for (var s2: s.ast) {
                                    elseSts.add(s2);
                                }
                            }

                $ast.add(new IfElse(condiciones, ifSts, elseSts, $start.getLine(), $start.getCharPositionInLine() + 1));
            }
        | 'while' condiciones+=expression+ 'do'  //while
           (sts+=statement)*
            {
                List<Expression> condiciones = new ArrayList<>();
                List<Statemment> sts= new ArrayList<>();

                for (var c: $condiciones) {condiciones.add(c.ast);}
                for (var s: $sts) {
                                for (var s2: s.ast) {
                                    sts.add(s2);
                                }
                            }

                $ast.add(new While(condiciones, sts, $start.getLine(), $start.getCharPositionInLine() + 1));
            }
        'end'
        | 'return' expression  //return
            {
                $ast.add(new Return($expression.ast, $start.getLine(), $start.getCharPositionInLine() + 1));
            }
        | expression '(' listExpressions ')' //invocacion por statement
            {

                $ast.add(new Invocation($start.getLine(), $start.getCharPositionInLine() + 1,
                    $expression.ast, $listExpressions.ast));
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
    : '[' i=INT_CONSTANT '::' type ']' {
        $ast = new ArrayType($start.getLine(), $start.getCharPositionInLine() + 1, $type.ast, LexerHelper.lexemeToInt($i.text) );
        }
    ;


struct returns [Type ast]
    : 'defstruct' 'do' r+=recordFields* 'end' {
                    List<RecordField> varDefs = new ArrayList<>();

                            for (var varDef1: $r) {
                                for (var varDef2: varDef1.ast) {
                                    varDefs.add(varDef2);
                                }
                            }
                    $ast = new StructType ($start.getLine(), $start.getCharPositionInLine() + 1, varDefs);
                }
    ;

//para el cuerpo del struct
recordFields returns [List<RecordField> ast = new ArrayList<>()]
    : ids+=ID (','ids+=ID)* '::' type
    {
        for(var id : $ids) {
            RecordField rf = new RecordField(id.getLine(), id.getCharPositionInLine() + 1, id.getText(), $type.ast);
            $ast.add(rf);

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

