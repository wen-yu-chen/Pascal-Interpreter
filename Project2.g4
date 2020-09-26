// Generate: antlr4 Project2.g4 -visitor
// Compile: javac Project2*.java 
// Run: grun Project2 program -tree tests/testNum.pas

grammar Project2;


start: program EOF; 
program: PROGRAM ID ';'  contents;

contents:
   
    | content contents
    ;

content: varDecl | proDecl | funcDecl |statements | comment;
comment: '(*' ID* '*)';

//variable declaration
varDecl: VAR (varDecl2)*;
varDecl2: variable (',' variable)* ':' TYPE ';';
variable: ID;

//procedure declaration
proDecl: PROCEDURE proDecl2;
proDecl2: ID ';';

//function declaration
funcDecl: FUNCTION funcDecl2;
funcDecl2: ID ':' TYPE ';';

//main block
statements: mainBlock;
mainBlock: BEGIN (statement)* end '.';
statement: varDef | ifStatement | brkStatement | contStatement | loops | readWrite | comment;
end: END;

//variable assignments
varDef: variable ':=' expr ';';

//if statement 
ifStatement: IF condStatement (ELSE IF condStatement)* (ELSE statement*)?;
condStatement: expr THEN statement*;
brkStatement: BREAK ';';
contStatement: CONTINUE ';';

//loops
loops: whileLoop | forLoop;
whileLoop: WHILE expr DO mainBlock; 
forLoop: FOR variable ':=' expr 'to' expr DO mainBlock;

//readln and writeln function
readWrite: 
    READLN '(' variable (',' variable)* ')' ';' #readFunc
    | WRITELN '(' expr (',' expr)* ')' ';' #writeFunc
    ; 

//expressions
expr:
    NOT expr #notExpr
    | expr op=(MUL | DIV | MOD) expr #mulExpr
    | expr op=AND expr #andExpr
    | expr op=(ADD | SUB) expr #addExpr
    | expr op=OR expr #orExpr
    | op=(SQRT | SIN | COS | LN | EXP ) '(' expr ')' #spcExpr
    | expr op=(EQ | LT | GT | NEQ | LTEQ | GTEQ) expr #relExpr
    | atom #atomExpr
    ;

atom:
    '(' expr ')' #parExpr
    | variable #varAtom
    | FLOAT #numAtom
    | (TRUE | FALSE) #boolAtom
    | ID #idAtom
    ;


PROGRAM: P R O G R A M;
VAR: V A R;
PROCEDURE: P R O C E D U R E;
FUNCTION: F U N C T I O N;
BEGIN: B E G I N;
END: E N D;

IF: I F;
THEN: T H E N;
ELSE: E L S E;
BREAK: B R E A K;
CONTINUE: C O N T I N U E;

WHILE: W H I L E;
DO: D O;
FOR: F O R;

TYPE: (REAL|BOOLEAN);

MUL: '*';
DIV:  '/';
MOD: M O D;
ADD: '+';
SUB: '-';

NOT: N O T;
AND: A N D;
OR: O R;

EQ: '=';
LT: '<';
GT: '>';
NEQ: '<>';
LTEQ: '<=';
GTEQ: '>=';

TRUE: T R U E;
FALSE: F A L S E;

READLN: R E A D L N;
WRITELN: W R I T E L N;
SQRT: S Q R T;
SIN: S I N;
COS: C O S;
LN: L N;
EXP: E X P;

fragment A : [aA]; // match either an 'a' or 'A'
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

REAL: R E A L; 
BOOLEAN: B O O L E A N;

ID: [_A-Za-z][_A-Za-z0-9]*;
FLOAT: ([0-9]*[.])?[0-9]+;
INT: [0-9]+ ;
WS: [ \t\r\n]+ -> skip ;