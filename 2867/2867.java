import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int numCases = scanner.nextInt();

        for (int i = 0; i < numCases; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int result = (int) (Math.floor(Math.log10(Math.pow(n, m)) + 1));
            System.out.println(result);
        }
    }
}