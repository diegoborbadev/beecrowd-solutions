{a, _} = IO.gets("") |> String.trim |> Float.parse
{b, _} = IO.gets("") |> String.trim |> Float.parse
{c, _} = IO.gets("") |> String.trim |> Float.parse
IO.puts("MEDIA = #{:erlang.float_to_binary((a * 2 + b * 3 + c * 5) / 10, [decimals: 1])}")
