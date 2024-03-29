import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    val a = scanner.nextDouble();
    val b = scanner.nextDouble();
    val c = scanner.nextDouble();
    println("MEDIA = %.1f".format((a * 2 + b * 3 + c * 5) / 10))
}