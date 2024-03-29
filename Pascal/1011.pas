{$mode objfpc}{$H+}

uses
    math;
var
    r: float;
    v: float;
begin
    readln(r);
    v := (4 / 3.0) * 3.14159 * r * r * r;
    writeln('VOLUME = ', v:0:3);
end.