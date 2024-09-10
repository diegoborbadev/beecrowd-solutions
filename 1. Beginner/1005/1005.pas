{$mode objfpc}{$H+}

uses
    math;
var
    r: float;
    a: float;
    b: float;
begin
    readln(a);
    readln(b);
    r := (a * 3.5 + b * 7.5) / 11;
    writeln('MEDIA = ', r:0:5);
end.