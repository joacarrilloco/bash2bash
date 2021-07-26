grammar b2b;

/*
                        ANALISIS SEMANTICO(PARSER)

    Todas las reglas gramaticales tienen un identificador que empieza por minuscula

*/

root: command* EOF;

command : gramar_excecution
        | execution_control
        | variables_expressions
        | arithmetic_logic
        ;

//GRAMMAR AND EXCECUTION
gramar_excecution: dash
                 | echo
                 | read
                 | comments
                 | comment_lines
                 ;
//dash
dash: 'dash' dashargs* (FILENAME | '\'' command '\'')?;
dashargs: arg=('-c' | '-a' | '-s');

//echo
echo: PR_echo;

//comments
comments: COMMENT;
comment_lines: COMMENT_MUL;

//read
read: PR_read ID;

//VARIABLES AND EXPRESSIONS
variables_expressions: var
                     | nill
                     ;

//instanciacion de variables ¿por que 'a' no encaja en ID? wat tf
var: ID EQ value;
value: NUMERO
     | SQ_WORD
     | DQ_WORD
     | '$'ID
     ;

//null
nill: PR_null;

//ARITHMETIC AND LOGIC
arithmetic_logic: boolean_val
                | logical_operators
                ;
//boolean
boolean_val: PR_true
           | PR_false
           ;
//logical operators
logical_operators: AND
                 | OR
                 | NOT
                 ;
//value arit_expr
/*
arit_expr:    NEG arit_expr                                                                                 #NegExpr
            | arit_expr op=(MULT | DIV | MOD) arit_expr                                                     #MultDivExpr
            | MENOS arit_expr                                                                               #MenosExpr
            | arit_expr op=(MAS | MENOS) arit_expr                                                          #SumResExpr
            | arit_expr op=(MENOR | MAYOR | MENOR_IGUAL | MAYOR_IGUAL) arit_expr                            #CompExpr
            | arit_expr op=(IGUAL | DIF) arit_expr                                                          #EqExpr
            | arit_expr AND arit_expr                                                                       #AndExpr
            | arit_expr OR arit_expr                                                                        #OrExpr
            | op=(ENTERO | REAL | CHAR | STRING | PR_verdadero | PR_falso)                                  #NumExpr
            | var                                                                                           #VarExpr
            | callfun                                                                                       #FunExpr
            | PAR_IZQ arit_expr PAR_DER                                                                     #ParentExpr
            ;
*/

//STRINGS
//REGEX
//DATES AND TIME
//FUNCTIONS
//EXECUTION CONTROL
execution_control: b_if
                 | b_while
                 | b_for
                 | b_until
                 ;
//if
b_if: PR_if L_SQUAREBR command R_SQUAREBR SEMIC
      PR_then command
      (PR_elif L_SQUAREBR command R_SQUAREBR SEMIC PR_then command)*
      (PR_else command)?
      PR_fi
      ;
//while
b_while: PR_while command SEMIC
         PR_do command SEMIC
         PR_done
         ;
//for
b_for: PR_for ID (PR_in ID*)?
       PR_do command SEMIC
       PR_done
       ;
//until
b_until: PR_until L_SQUAREBR command R_SQUAREBR SEMIC
         PR_do command SEMIC
         PR_done
         ;

//EXCEPTIONS
//CONCURRENCY
//STREAMS
//FILES
//DIRECTORIES
//PROCESSES AND ENVIRONMENT
//LIBRARIES AND NAMESPACES
//REFLECTION
//DEBUGGING AND PROFILING

/*
                        ANALISIS LEXICO(LEXER)

    Todos los tokens, palabras reservadas y reglas lexicas tienen un
    identificador que empieza por mayuscula

*/

//TOKENS

OR: '||';
AND: '&&';
AMP: '&';
SEMIC: ';';
DOUBLE_SEMIC: ';;';
SEMIAMP: ';&';
DOUBLE_SEMIAMP: ';;&';
PIPE: '|';
PIPEAMP: '|&';
L_BR: '(';
R_BR: ')';
L_SQUAREBR: '[';
R_SQUAREBR: ']';
L_CURLYBR: '{';
R_CURLYBR: '}';
LT: '<';
GT: '>';
EQ: '=';
NE: '!=';
GOET: '>=';
LOET: '<=';
NOT: '!';

//quotes
DOUBLE_QUOTE: '"';
SINGLE_QUOTE: '\'';
BACKSLASH: '\\';


//PALABRAS RESERVADAS DE SHELL

//condicionales
PR_if: 'if';
PR_then: 'then';
PR_elif: 'elif';
PR_else: 'else';
PR_fi: 'fi';
PR_time: 'time';

//estructuras de control
PR_for: 'for';
PR_in: 'in';
PR_until: 'until';
PR_while: 'while';
PR_do: 'do';
PR_done: 'done';

//otros
PR_case: 'case';
PR_esac: 'esac';
PR_coproc: 'coproc';
PR_select: 'select';
PR_function: 'function';
PR_Lsquarebracket: '[[';
PR_Rsquarebracket: ']]';
PR_true: 'true';
PR_false: 'false';
PR_null: '\'\'';
PR_echo: 'echo' ~[\n]*;
PR_read: 'read';

//REGLAS LEXICAS (Poner más arriba las reglas menos genericas o que menos matches tienen)
// por ejemplo, poner la regla para una palabra reservada antes de la regla para un identificador
//EXT: [.][a-zA-Z0-9]+;
//WORDS

NUMERO: [0-9]+([.][0-9]+)?;
ID: [a-zA-Z][a-zA-Z0-9_]*;
FILENAME: [a-zA-Z][a-zA-Z0-9_]*[.][a-zA-Z0-9]+;
SQ_WORD: '\'' ( '\\"' | . )*? '\'' ;
DQ_WORD: '"' ( '\\"' | . )*? '"' ;
COMMENT: '#' ~[\r]*;
COMMENT_MUL: '<<EOF' (.)*? 'EOF';
WS		: [ \t\r\n]+ -> skip ;
//DIFF: ~[\n]*;
