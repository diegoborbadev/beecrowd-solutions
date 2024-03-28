{$mode objfpc}{$H+}

uses
    math;
var
    r: float;
    a: float;
begin
    readln(r);
    a := 3.14159 * r * r;
    writeln('A=', a:0:2);
end.