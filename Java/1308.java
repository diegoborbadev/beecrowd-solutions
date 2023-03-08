import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long m = scanner.nextLong();
            
            //Baskara (a = 1, b= 1, c= -2m)
            double r = (-1 + Math.sqrt(1 + 8 * m)) / 2;
            
            System.out.println((int) r);
        }
    }
}