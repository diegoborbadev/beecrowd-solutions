import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] items = scanner.nextLine().split(" ");

        int[] l = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            l[i] = Integer.parseInt(items[i]);
        }

        int r = 1;
        for (int i = 2; i < l.length; i++) {
            if (l[i] - l[i - 1] != l[i - 1] - l[i - 2]) {
                r += 1;
            }
        }

        System.out.println(r);
    }
}