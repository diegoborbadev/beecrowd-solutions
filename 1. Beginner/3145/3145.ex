input = IO.gets("")
[n_str, x_str] = String.split(String.trim(input))

{n, _} = Float.parse(n_str)
{x, _} = Float.parse(x_str)

IO.puts(:erlang.float_to_binary(x / (n + 2), decimals: 2))
