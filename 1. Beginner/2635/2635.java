import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            List<String> data = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String text = scanner.next();
                data.add(text);
            }
            int q = scanner.nextInt();
            while (q-- > 0) {
                String text = scanner.next();
                int ans = 0, len = 0;
                for (String word : data) {
                    if (word.startsWith(text)) {
                        ans++;
                        len = Math.max(len, word.length());
                    }
                }
                if (ans == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(ans + " " + len);
                }
            }
        }
        scanner.close();
    }
}