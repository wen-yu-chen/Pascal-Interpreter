PROGRAM main;
VAR a, b : BOOLEAN;
function myPro: BOOLEAN;
    VAR x: BOOLEAN;
    begin
        a := true;
        writeln(a);
        b := false;
        writeln(b);
        x := a or b;
        writeln(x);
    end.
begin
   x := a or b;
end.