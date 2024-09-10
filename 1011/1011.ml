Scanf.scanf "%f" (fun r ->
    Printf.printf "VOLUME = %.3f\n" (r *. r *. r *. 3.14159 *. (4.0 /. 3.0));
)