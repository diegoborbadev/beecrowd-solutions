import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    val jon = scanner.next();
    val doc = scanner.next();
    if (jon.length >= doc.length) {
        println("go")
    } else {
        println("no")
    }
}
