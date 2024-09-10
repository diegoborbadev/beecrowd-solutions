import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        char c;
        int n, m, x;
        int ans = 0;
        int[] run = new int[200];

        n = scanner.nextInt();
        m = scanner.nextInt();

        while (n-- > 0) {
            c = scanner.next().charAt(0);
            x = scanner.nextInt();
            scanner.nextLine();
            run[c] = x;
        }

        scanner.nextInt();
        scanner.nextLine();

        String items = scanner.nextLine();
        for (String item : items.split(" ")) {
            ans += run[item.charAt(0)];
        }

        System.out.printf("%d\n%s\n", ans, ans >= m ? "You shall pass!" : "My precioooous");

        scanner.close();
    }
}