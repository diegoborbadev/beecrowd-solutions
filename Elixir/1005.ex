{a, _} = IO.gets("") |> String.trim |> Float.parse
{b, _} = IO.gets("") |> String.trim |> Float.parse
IO.puts("MEDIA = #{:erlang.float_to_binary((a * 3.5 + b * 7.5) / 11, [decimals: 5])}")
