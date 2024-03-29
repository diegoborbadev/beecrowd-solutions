import Foundation

if let inputA = readLine(), let inputB = readLine(), let a = Float(inputA), let b = Float(inputB) {
    let r = (a * 3.5 + b * 7.5) / 11.0
    print(String(format: "MEDIA = %.5f",  r))
}