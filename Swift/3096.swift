import Foundation

if let input = readLine(), let n = Int(input) {
    let r = floor(Double(n) * log10(Double(n) / M_E) + log10(2 * Double.pi * Double(n)) / 2 + 1)
    print(Int(r))
}