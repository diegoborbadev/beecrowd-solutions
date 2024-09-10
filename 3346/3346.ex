input = IO.gets("") |> String.trim()
[f1, f2] = input |> String.split(" ") |> Enum.map(&String.to_float/1)

ft = ((1 + f1 / 100) * (1 + f2 / 100) - 1) * 100

IO.puts("#{:erlang.float_to_binary(ft, [decimals: 6])}")
