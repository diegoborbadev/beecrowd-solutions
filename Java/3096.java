import java.io.IOException;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        double n = scanner.nextInt();
        System.out.println((int) Math.floor(n*Math.log10(n/Math.E) + Math.log10(2*Math.PI*n)/2.0) + 1);
    }
}