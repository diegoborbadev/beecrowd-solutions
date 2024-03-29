Scanf.scanf "%f\n%f\n%f" (fun a b c ->
    Printf.printf "MEDIA = %.1f\n" (((a) *. 2.0 +. (b) *. 3.0 +. (c) *. 5.0) /. 10.0);
)