PROGRAM main;
VAR a: REAL;
procedure myPro1;
    VAR b: REAL;
    procedure myPro2;
        VAR c: REAL;
    begin
        a := 1;
        writeln(a);
        b := 2;
        writeln(b);
        c := 3;
        writeln(3);
    end.
begin
    a := 11;
    writeln(a);
    b := 22;
    writeln(b);
end.
begin
   a := 111;
   writeln(a);
   writeln(b);
   writeln(c);
end.
