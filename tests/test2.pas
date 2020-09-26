PROGRAM main;
VAR a, b, c: REAL;
x, y, z: BOOLEAN;
begin
    a := 1;
    b := 2;
    c := 3;

    if a > b then writeln(b);
    else if a > c then writeln(c);
    else writeln(a);

    if a = 1 then writeln(1);
    if a >= 1 then writeln(1);
    if a <= 1 then writeln(1);
    if a <> 0 then writeln(1);

    x := true;
    y := true;

    z := not x;
    writeln(z);
    z := x and false;
    writeln(z);
    z := x or false;
    writeln(z); 
end.