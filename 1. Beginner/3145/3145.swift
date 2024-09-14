import Foundation

if let input = readLine() {
    let components = input.split(separator: " ").compactMap { Int($0) }
    if components.count == 2, let n = components.first, let x = components.last {
        print(String(format: "%.2f", Double(x) / Double(n + 2)))
    }
}