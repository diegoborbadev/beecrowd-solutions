import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, h, b = 0, a = 0, m = 0, d = 0;
        String e, g;
        n = scanner.nextInt();
        scanner.nextLine();

        while (n-- > 0) {
            e = scanner.next();
            g = scanner.next();
            h = scanner.nextInt();

            if (g.equals("bonecos"))
                b += h;
            else if (g.equals("arquitetos"))
                a += h;
            else if (g.equals("musicos"))
                m += h;
            else
                d += h;
        }

        System.out.println(b / 8 + a / 4 + m / 6 + d / 12);

        scanner.close();
    }
}