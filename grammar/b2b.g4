grammar b2b;

/*
                        ANALISIS SEMANTICO(PARSER)

    Todas las reglas gramaticales tienen un identificador que empieza por minuscula

*/

root: command* EOF;

//VARIABLES AND EXPRESSIONS
command : dash
        | execution_control
        ;

dash: 'dash' dashargs* (FILENAME | '\'' command '\'');
dashargs: '-' dashparams;
dashparams: 'c' | 'a' | 's';

//ARITHMETIC AND LOGIC
//STRINGS
//REGEX
//DATES AND TIME
//FUNCTIONS
//EXECUTION CONTROL
execution_control: b_if | b_while | b_for | b_until;
b_if: PR_if command SEMIC
      PR_then command SEMIC
      (PR_elif command SEMIC PR_then command SEMIC)*
      PR_else command SEMIC
      PR_fi
      ;
b_while: PR_while command SEMIC
         PR_do command SEMIC
         PR_done
         ;
b_for: PR_for ID (PR_in ID*)?
       PR_do command SEMIC
       PR_done
       ;
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
Exclamation: '!';

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


//REGLAS LEXICAS (Poner más arriba las reglas menos genericas o que menos matches tienen)
// por ejemplo, poner la regla para una palabra reservada antes de la regla para un identificador
//EXT: [.][a-zA-Z0-9]+;
//WORDS
ID: [a-zA-Z][a-zA-Z0-9_]*;
FILENAME: [a-zA-Z][a-zA-Z0-9_]*[.][a-zA-Z0-9]+;
COMMENT: '#' ~[\r\n]* -> skip;
WS		: [ \t\r]+ -> skip ;