import Foundation

if let input = readLine(), let r = Double(input) {
    print(String(format: "VOLUME = %.3f", (4 / 3.0) * 3.14159 * r * r * r))
}