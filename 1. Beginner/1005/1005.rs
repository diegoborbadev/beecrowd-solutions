use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input);
    let a: f64 = input.trim().parse().unwrap();

    let mut input = String::new();
    io::stdin().read_line(&mut input);
    let b: f64 = input.trim().parse().unwrap();

    println!("MEDIA = {:.5}", (a * 3.5 + b * 7.5) / 11.0);
}