input = IO.gets("") |> String.trim()
[h1, m1, h2, m2] = input |> String.split(" ") |> Enum.map(&String.to_integer/1)

if h2 <= h1 and m2 <= m1 do
    t = (((h2 + 24)* 3600) + (m2 * 60)) - ((h1 * 3600) + (m1 * 60))
    h = div(t, 3600)
    m = div((t - (h * 3600)), 60)

    IO.puts "O JOGO DUROU #{h} HORA(S) E #{m} MINUTO(S)"
else
    if m2 <= m1 do
        t = (((h2 - 1)* 3600) + ((m2 + 60) * 60)) - ((h1 * 3600) + (m1 * 60))
        h = div(t, 3600)
        m = div((t - (h * 3600)), 60)

        IO.puts "O JOGO DUROU #{h} HORA(S) E #{m} MINUTO(S)"
    else
        t = ((h2* 3600) + (m2 * 60)) - ((h1 * 3600) + (m1 * 60))
        h = div(t, 3600)
        m = div((t - (h * 3600)), 60)

        IO.puts "O JOGO DUROU #{h} HORA(S) E #{m} MINUTO(S)"
    end
end
