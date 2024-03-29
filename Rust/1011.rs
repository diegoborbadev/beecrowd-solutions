use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input);
    let r: f64 = input.trim().parse().unwrap();

    println!("VOLUME = {:.3}", (4.0 / 3.0) * 3.14159 * r * r * r);
}