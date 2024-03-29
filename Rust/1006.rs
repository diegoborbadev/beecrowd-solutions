use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input);
    let a: f64 = input.trim().parse().unwrap();

    let mut input = String::new();
    io::stdin().read_line(&mut input);
    let b: f64 = input.trim().parse().unwrap();

    let mut input = String::new();
    io::stdin().read_line(&mut input);
    let c: f64 = input.trim().parse().unwrap();

    println!("MEDIA = {:.1}", (a * 2.0 + b * 3.0 + c * 5.0) / 10.0);
}