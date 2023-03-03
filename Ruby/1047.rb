h1, m1, h2, m2 = gets.split.map(&:to_i)

if h2 <= h1 && m2 <= m1
  h2 += 24
elsif m2 <= m1
  m2 += 60
  h2 -= 1
end

t = ((h2 * 3600) + (m2 * 60)) - ((h1 * 3600) + (m1 * 60))
h = t / 3600
m = (t - (h * 3600)) / 60

puts "O JOGO DUROU #{h.to_i} HORA(S) E #{m.to_i} MINUTO(S)"