{$mode objfpc}{$H+}

uses
    math;
var
    x: float;
    r: float;
begin
    readln(x);
    r := x * 6.28;
    writeln(r:0:2);
end.