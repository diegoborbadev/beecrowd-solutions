import java.io.IOException;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        double d = scanner.nextDouble();
        int n = (int) d;
        int m = (int) ((d - n) * 100);
   
        System.out.println("NOTAS:");
        System.out.println(n / 100 + " nota(s) de R$ 100.00");
        n -= (n / 100) * 100;
        
        System.out.println(n / 50 + " nota(s) de R$ 50.00");
        n -= (n / 50) * 50;
        
        System.out.println(n / 20 + " nota(s) de R$ 20.00");
        n -= (n / 20) * 20;
        
        System.out.println(n / 10 + " nota(s) de R$ 10.00");
        n -= (n / 10) * 10;
        
        System.out.println(n / 5 + " nota(s) de R$ 5.00");
        n -= (n / 5) * 5;
        
        System.out.println(n / 2 + " nota(s) de R$ 2.00");
        n -= (n / 2) * 2;
        
        System.out.println("MOEDAS:");
        System.out.println(n / 1 + " moeda(s) de R$ 1.00");
        n -= n / 1 * 1;

        System.out.println(m / 50 + " moeda(s) de R$ 0.50");
        m -= (m / 50) * 50;
        
        System.out.println(m / 25 + " moeda(s) de R$ 0.25");
        m -= (m / 25) * 25;
        
        System.out.println(m / 10 + " moeda(s) de R$ 0.10");
        m -= (m / 10) * 10;
        
        System.out.println(m / 5 + " moeda(s) de R$ 0.05");
        m -= (m / 5) * 5;
        
        System.out.println(m + " moeda(s) de R$ 0.01");
    }
}