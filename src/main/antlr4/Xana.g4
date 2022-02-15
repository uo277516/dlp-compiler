grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: INT_CONSTANT | REAL_CONSTANT | ID
       ;

INT_CONSTANT: DIGIT+
            ;

ID: (LETTER+ ['_'-DIGIT?-LETTER]*)
    |
    ('_'+ ['_'-DIGIT?-LETTER]*)
    ;

REAL_CONSTANT: REAL_CONSTANT_DECIMAL
                |
               REAL_CONSTANT_EXP
            ;

fragment
REAL_CONSTANT_DECIMAL: (INT_CONSTANT*.INT_CONSTANT*)
            ;
fragment
REAL_CONSTANT_EXP: ((REAL_CONSTANT_DECIMAL'E'[+-]INT_CONSTANT)
                                       |
                   ((INT_CONSTANT|REAL_CONSTANT_DECIMAL)'e'INT_CONSTANT))
              ;

fragment
DIGIT: [0-9]
    ;

fragment
LETTER: [a-zA-Z]
    ;