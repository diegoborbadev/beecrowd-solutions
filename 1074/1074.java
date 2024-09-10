import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();

			if (x == 0) {
				System.out.println("NULL");
			} else {
				System.out.print(x % 2 == 0 ? "EVEN " : "ODD ");
				System.out.println(x > 0 ? "POSITIVE" : "NEGATIVE");
			}
		}
	}
}