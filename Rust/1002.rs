use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input);
    let r: f64 = input.trim().parse().unwrap();

    println!("A={:.4}", 3.14159 * r * r);
}