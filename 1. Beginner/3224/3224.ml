let jon = read_line () in
let doc = read_line () in
if String.length jon >= String.length doc then
  print_endline "go"
else
  print_endline "no"