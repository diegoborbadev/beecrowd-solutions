import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            String str = scanner.next();
            if(str.equals("P=NP")) {
                System.out.println("skipped");
            } else {
                String[] arr = str.split("\\+");
                System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
            }
        }
    }
}