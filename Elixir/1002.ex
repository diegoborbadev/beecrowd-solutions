{r, _} = IO.gets("") |> String.trim |> Float.parse
IO.puts("A=#{:erlang.float_to_binary(:math.pow(r,2) * 3.14159,[decimals: 4])}")
