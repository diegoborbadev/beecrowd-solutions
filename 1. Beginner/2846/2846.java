import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.close();
        
        int count = 0;
        int num = 1;
        
        while (count < k) {
            num++;
            if (!isFibonacci(num)) {
                count++;
            }
        }
        
        System.out.println(num);
    }
    
    public static boolean isFibonacci(int n) {
        int a = 1;
        int b = 1;
        
        while (a <= n) {
            if (a == n) {
                return true;
            }
            
            int temp = a;
            a = b;
            b = temp + b;
        }
        
        return false;
    }
}