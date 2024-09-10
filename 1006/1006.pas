{$mode objfpc}{$H+}

uses
    math;
var
    r: float;
    a: float;
    b: float;
    c: float;
begin
    readln(a);
    readln(b);
    readln(c);
    r := (a * 2 + b * 3 + c * 5) / 10;
    writeln('MEDIA = ', r:0:1);
end.