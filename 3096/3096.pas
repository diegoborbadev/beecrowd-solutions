{$mode objfpc}{$H+}

uses
  math;

var
  n: integer;
  r: integer;
begin
  readln(n);
  r := floor(n*log10(n/exp(1)) + log10(2*pi*n)/2 + 1);
  writeln(r);
end.