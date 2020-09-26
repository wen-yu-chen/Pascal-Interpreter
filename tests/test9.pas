PROGRAM main;
VAR a: REAL;
procedure myPro;
    VAR b: REAL;
    begin
        for b := 0 to 10 do
        begin
            writeln(b);
            a := b;
            if b = 5 then break;
        end.
        writeln(a);
        a := a + 1;
    end.
begin
   writeln(a);
end.