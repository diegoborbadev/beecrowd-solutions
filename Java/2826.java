import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        scanner.close();
        
        String[] result = main(A, B);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static String[] main(String A, String B) {
        if (A.equals(B)) {
            String[] result = { A, B };
            return result;
        }

        int length = Math.min(A.length(), B.length());

        for (int i = 0; i < length; i++) {
            if (A.charAt(i) != B.charAt(i)) {
                if (A.charAt(i) < B.charAt(i)) {
                    String[] result = { A, B };
                    return result;
                } else {
                    String[] result = { B, A };
                    return result;
                }
            }
        }

        if (A.length() < B.length()) {
            String[] result = { A, B };
            return result;
        } else {
            String[] result = { B, A };
            return result;
        }
    }
}