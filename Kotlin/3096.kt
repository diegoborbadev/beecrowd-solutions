import java.util.Scanner;
import kotlin.math.floor;
import kotlin.math.log10;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    
    val n: Int = scanner.nextInt();
    
    val r: Double = floor(n*log10(n/Math.E) + log10(2*Math.PI*n)/2.0) + 1;
    println(r.toInt());
}