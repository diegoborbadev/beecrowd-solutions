import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
		int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
		if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
            System.out.println("Valores aceitos"); 
        } else { 
            System.out.println("Valores nao aceitos");
        }
    }
}