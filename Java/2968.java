import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int n = scanner.nextInt();
        int x = v * n;
        
        StringBuilder r = new StringBuilder();
        for (int i = 10; i < 100; i += 10) {
            r.append((int) Math.ceil(x / (100.0 / i)));
            if (i < 90) {
                r.append(" ");
            }
        }
        
        System.out.println(r.toString());
	}
}