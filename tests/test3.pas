PROGRAM main;
VAR a : REAL;
procedure myPro;
    VAR x: REAL;
    begin
        x := 10;
        writeln(x);
        (* this is comment *)
        a := 3.14;
        writeln(a);
        a := sin(a / 2);
        writeln(a);
    end.
begin
   writeln(a);
end.
