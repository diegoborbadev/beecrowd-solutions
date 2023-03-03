local input = io.read("*line")
local h1, m1, h2, m2 = string.match(input, "(%d+) (%d+) (%d+) (%d+)")

h1 = tonumber(h1)
m1 = tonumber(m1)
h2 = tonumber(h2)
m2 = tonumber(m2)

if h2 <= h1 and m2 <= m1 then
  h2 = h2 + 24
elseif m2 <= m1 then
  m2 = m2 + 60
  h2 = h2 - 1
end

t = ((h2 * 3600) + (m2 * 60)) - ((h1 * 3600) + (m1 * 60))
h = math.floor(t / 3600)
m = math.floor((t - (h * 3600)) / 60)

io.write(string.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", h, m))