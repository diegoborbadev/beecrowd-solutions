{$mode objfpc}{$H+}

uses
    math;
var
    n : int64;
    m : int64;
    s : float;
begin
    read(n);
    read(m);
    read(s);
    writeln('NUMBER = ', n);
    writeln('SALARY = U$ ', m * s:0:2);
end.