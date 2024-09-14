import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    val n = scanner.nextDouble();
    val x = scanner.nextDouble();
    println("%.2f".format(x / (n + 2)))
}