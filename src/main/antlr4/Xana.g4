grammar Xana;


@header {
package es.uniovi.dlp.parser;
}



//que pueda ser combinación de ambos
program: varDef
    |funDef
       ;

//-----funciones---


//para la main crear una regla aparte que para las definiciones
//de funciones

funDef: 'def' ID '(' parameterList ')' '::' returnType 'do'
            funBody
          'end'
        ;

returnType: simple_type
    | 'void'
    ;


funMain: 'def' 'main' '(' ')' 'do' funBody 'end'
    ;


funBody: varDef+ statement+ 'return' expression
    ;


//--expresiones
expression: INT_CONSTANT  //mirar ast
    | REAL_CONSTANT
    | CHAR_CONSTANT
    | ID
    | invocation
    | arrayAcess
    | fileAcces
    | cast
    | unaryMinus
    | unaryNot
    | arithmetic
    | logical
    | comparator
    ;

comparator: ' ';

logical: ' ';

arithmetic: ' ';

unaryNot: ' ';

unaryMinus: ' ';

cast: ' ';

fileAcces: ' ';

arrayAcess: ' ';

invocation: ' ';


//statements
statement: 'a'
    ;





//parámetros de la lista
parameterList: param? (','param)*
    ;

param: ID '::' type
    ;





//-------variables--------

varDef: ID (','ID)* '::' type '\\''n'
    ;

type: simple_type
    | complex_type
        ;

complex_type: array
    | struct
    ;

simple_type: 'int'
    | 'double'
    | 'char'
    ;


array: '[' INT_CONSTANT '::' type ']'
    ;


struct: 'defstruct' 'do' recordFields+ 'end'
    ;

//para el cuerpo del struct
recordFields: ID (','ID)* '::' type '\\''n'
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

