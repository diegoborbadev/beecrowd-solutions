import Foundation

if let input = readLine(), let r = Double(input) {
    print(String(format: "A=%.4f", 3.14159 * r * r))
}