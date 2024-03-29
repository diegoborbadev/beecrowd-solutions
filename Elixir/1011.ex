{r, _} = IO.gets("") |> String.trim |> Float.parse
IO.puts("VOLUME = #{:erlang.float_to_binary(:math.pow(r,3) * 3.14159 * (4 / 3.0),[decimals: 3])}")
