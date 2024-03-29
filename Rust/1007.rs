use std::io;

fn main() {
    let mut inputA = String::new();
    io::stdin().read_line(&mut inputA);
    
    let mut inputB = String::new();
    io::stdin().read_line(&mut inputB);

    let mut inputC = String::new();
    io::stdin().read_line(&mut inputC);

    let mut inputD = String::new();
    io::stdin().read_line(&mut inputD);

    let a: i32 = inputA.trim().parse().unwrap();
    let b: i32 = inputB.trim().parse().unwrap();
    let c: i32 = inputC.trim().parse().unwrap();
    let d: i32 = inputD.trim().parse().unwrap();

    println!("DIFERENCA = {}", a * b - c * d);
}