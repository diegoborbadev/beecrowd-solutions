{$mode objfpc}{$H+}

var
  doc: string;
  jon: string;
begin
  readln(jon);
  readln(doc);
  if Length(jon) >= Length(doc) then
    writeln('go')
  else
    writeln('no');
end.