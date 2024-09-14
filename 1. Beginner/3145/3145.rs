use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let nums: Vec<f64> = input.trim().split_whitespace()
                               .map(|s| s.parse().unwrap())
                               .collect();
    let n = nums[0];
    let x = nums[1];

    println!("{:.2}", x / (n + 2.0));
}