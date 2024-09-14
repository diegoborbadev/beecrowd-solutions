import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    
    val n: Int = scanner.nextInt();
    val m: Int = scanner.nextInt();
    val s: Float = scanner.nextFloat();
    
    println("NUMBER = %d\nSALARY = U$ %.2f".format(n, m * s))
}