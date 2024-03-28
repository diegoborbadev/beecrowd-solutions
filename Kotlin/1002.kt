import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    val r = scanner.nextDouble();
    println("A=%.4f".format(r * r * 3.14159))
}