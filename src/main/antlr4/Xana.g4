grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: INT_CONSTANT |
            REAL_CONSTANT |
            ID |
            ONELINE_COMMENT |
            LINES_COMMENT |
            CHAR_CONSTANT
       ;

INT_CONSTANT: '0'|[1-9]DIGIT*
            ;

ID: (LETTER|'_')(ID_BODY)*
    ;

REAL_CONSTANT:  REAL_CONSTANT_DECIMAL
                |
               REAL_CONSTANT_EXP
            ;

ONELINE_COMMENT: '#' .* ('\n'|EOF) -> skip
        ;

LINES_COMMENT : ('"""') .* ('"""')
    ;

CHAR_CONSTANT : '\'' (LETTER|ASCI|CHAR_ESPECIAL) '\''
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
CHAR_ESPECIAL : '\t' | '\n'
        ;


fragment
ID_BODY : (LETTER|DIGIT|'_')
         ;



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

