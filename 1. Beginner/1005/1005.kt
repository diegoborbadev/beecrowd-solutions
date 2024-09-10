import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    val a = scanner.nextDouble();
    val b = scanner.nextDouble();
    println("MEDIA = %.5f".format((a * 3.5 + b * 7.5) / 11))
}