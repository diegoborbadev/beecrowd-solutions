import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    
    val a: Int = scanner.nextInt();
    val b: Int = scanner.nextInt();
    val c: Int = scanner.nextInt();
    val d: Int = scanner.nextInt();
    
    println("DIFERENCA = " + (a * b - c * d));
}