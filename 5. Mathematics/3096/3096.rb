n = gets.to_i 
r = n*Math.log10(n/Math::E) + Math.log10(2*Math::PI*n)/2.0
puts r.floor() + 1