grammar prolog;

p_text: ( clause) * EOF ;

clause: term '.' ;

termlist
    : term ( ',' term )*
    ;

term
    : VARIABLE          # variable
    | '(' term ')'      # braced_term
    | '-'? integer      # integer_term
    | atom '(' termlist ')'     # compound_term
    |<assoc=right> term operator term        # binary_operator
    | operator term             # unary_operator
    | '[' termlist ( '|' term )? ']' # list_term
    | '{' termlist '}'          # curly_bracketed_term
    | atom              # atom_term
    ;

operator
    : ':-' | '-->'
    | '?-'
    | ';'
    | '->'
    | ','
    | '^'
    | '\\'
    ;

atom
    : '[' ']'           # empty_list
    | LETTER_DIGIT      # name
    ;

integer
    : DECIMAL
    ;

LETTER_DIGIT
    : SMALL_LETTER ALPHANUMERIC*
    ;

VARIABLE
    : CAPITAL_LETTER ALPHANUMERIC*
    ;

DECIMAL: DIGIT+ ;

fragment ALPHANUMERIC: ALPHA | DIGIT ;
fragment ALPHA: '_' | SMALL_LETTER | CAPITAL_LETTER ;
fragment SMALL_LETTER: [a-z_];
fragment CAPITAL_LETTER: [A-Z];
fragment DIGIT: [0-9] ;

WS
   : [ \t\r\n]+ -> skip
   ;