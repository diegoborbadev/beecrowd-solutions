import Foundation

if let n = readLine(), let m = readLine(), let s = readLine(), let mInt = Int(m), let sFloat = Float(s) {
    if let nInt = Int(n) {
        let salary = Float(mInt) * sFloat
        print("NUMBER = \(nInt)")
        print(String(format: "SALARY = U$ %.2f", salary))
    }
}