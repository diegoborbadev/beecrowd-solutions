import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.next();
            long sum = 0;

            for (int i = input.length() - 1, j = 0; i >= 0; --i, ++j) {
                sum += (long) ((input.charAt(i) - 'A' + 1) * Math.pow(26, j));
            }
            if (sum <= 16384) {
                System.out.println(sum);
            } else {
                System.out.println("Essa coluna nao existe Tobias!");
            }
        }

        scanner.close();
    }
}