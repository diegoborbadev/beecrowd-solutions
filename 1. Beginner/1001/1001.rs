use std::io;

fn main() {
    let mut inputA = String::new();
    io::stdin().read_line(&mut inputA);
    
    let mut inputB = String::new();
    io::stdin().read_line(&mut inputB);

    let a: i32 = inputA.trim().parse().unwrap();
    let b: i32 = inputB.trim().parse().unwrap();

    println!("X = {}", a + b);
}