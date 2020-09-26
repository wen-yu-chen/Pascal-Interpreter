PROGRAM main;
VAR a, b, c: REAL;
begin
    a := 3;
    b := 4;
    c := (a - 1) + b;
    writeln(c);

    c := sqrt(b);
    writeln(c);
    c := sin(3.14/2);
    writeln(c);
    c := cos(0);
    writeln(c);
    c := ln(a - 2);
    writeln(c);
    c := exp(a);
    writeln(c);
    
    c := 5 / 2;
    writeln(c);
    c := 5 mod 2;
    writeln(c);
end.