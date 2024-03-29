import Foundation

if let inputA = readLine(), let inputB = readLine(), let inputC = readLine(), let a = Double(inputA), let b = Double(inputB), let c = Double(inputC) {
    let r = (a * 2 + b * 3 + c * 5) / 10
    print(String(format: "MEDIA = %.1f",  r))
}