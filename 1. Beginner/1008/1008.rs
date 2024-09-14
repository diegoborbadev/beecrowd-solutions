use std::io;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();
    let n: i32 = n.trim().parse().unwrap();

    let mut m = String::new();
    io::stdin().read_line(&mut m).unwrap();
    let m: i32 = m.trim().parse().unwrap();

    let mut s = String::new();
    io::stdin().read_line(&mut s).unwrap();
    let s: f64 = s.trim().parse().unwrap();

    println!("NUMBER = {}", n);
    println!("SALARY = U$ {:.2}", (m as f64 * s));
}