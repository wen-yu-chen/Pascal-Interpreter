PROGRAM main;
VAR a: REAL;
procedure myPro1;
    VAR b: REAL;
    procedure myPro2;
        VAR c: REAL;
    begin
        c := 0;
        while c < 5 do 
        begin
            writeln(c);
            b := c + 1;
            writeln(b);
            c := c + 1;
        end.
    end.
begin
    writeln(b);
end.
begin
    a := b;
    writeln(a);
end.