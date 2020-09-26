# Pascal Interpreter

## Comment
Name: Wen-Yu Chen
Features: Loops with break and continue, functions/procedures, variable scope along with all the features from project1
Also, nested functions/procedures works with scope.

## Command
Generate: 
    antlr4 Project2.g4 -visitor

Compile: 
    javac *.java

Run: 
    java Main tests/testNum.pas

    Note: Replace 'Num' in testNum with the test file number(1 to 10).
    Ex: java Main tests/test1.pas

## Test Files
There are ten test files in the tests folder that cover all the functionalities that I implemnted including the ones from  project1.

## Output Files
There are ten output files in the outputs folder that contain outputs for corresponding test files.
Ex: out1.pas contains the output when running test1.pas

## Bugs
break and continue keyword does not work sometime when there are statements after the keyword. They both work in other cases.
