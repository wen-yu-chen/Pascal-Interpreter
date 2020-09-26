PROGRAM main;
VAR a: REAL;
procedure myPro1;
    VAR b: REAL;
    procedure myPro2;
        VAR c: REAL;
    begin
        c := 0;
        while c < 50 do 
        begin
            b := ((c + 10) * 5) - 5;
            if (c mod 2) <> 0 then 
                c := c + 1; 
                continue;
            else
                c := c + 2; 
                writeln(c);
        end.
        writeln(b);
        a := sin(42.33);
    end.
begin
    writeln(a);
end.
begin
    a := b;
    writeln(a);
end.