import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();

        int q, r;
        if (a >= 0) {
            q = a / b;
            r = a % b;
        } else {
            int y = 0;
            int x = (b < 0) ? b * -1 : b;
            for (r = 0; r < x; r++) {
                y = a - r;
                if (y % b == 0) break;
            }
            q = y / b;
        }

        System.out.println(q + " " + r);
    }
}