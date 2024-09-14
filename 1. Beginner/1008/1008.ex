n = IO.gets("") |> String.trim |> String.to_integer
{m, _} = IO.gets("") |> String.trim |> Float.parse
{s, _} = IO.gets("") |> String.trim |> Float.parse

IO.puts "NUMBER = #{n}\nSALARY = U$ #{:erlang.float_to_binary(m * s, [decimals: 2])}"
