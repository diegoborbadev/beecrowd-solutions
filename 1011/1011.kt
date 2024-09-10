import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    val r = scanner.nextDouble();
    println("VOLUME = %.3f".format((4 / 3.0) * 3.14159 * r * r * r))
}