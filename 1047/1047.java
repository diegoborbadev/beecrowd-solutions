import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int  h2 = scanner.nextInt();
        int  m2 = scanner.nextInt();

        if (h2 <= h1 && m2 <= m1) {
            h2+= 24;
        } else if (m2 <= m1) {
            m2+= 60;
            h2-= 1;
        }

        int t = ((h2 * 3600) + (m2 * 60)) - ((h1 * 3600) + (m1 * 60));
        int h = t / 3600;
        int m = (t - (h * 3600)) / 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", h, m);
    }
}