import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i+=2) {
			System.out.println(i);
		}
	}
}