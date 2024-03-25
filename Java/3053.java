import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        char r = scanner.next().charAt(0);

        for (int i = 0; i < n; i++) {
            r = switch (scanner.nextInt()) {
                case 1 -> verify(r, 'A', 'B');
                case 2 -> verify(r, 'B', 'C');
                case 3 -> verify(r, 'A', 'C');
                default -> r;
            };
        }

        System.out.println(r);
    }

    private static char verify(char r, char x, char y) {
        if (r == x) {
            return y;
        } else if (r == y) {
            return x;
        }
        return r;
    }
}