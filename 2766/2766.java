import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		scanner.next(); // 1
		scanner.next(); // 2
		String a = scanner.next(); // 3

		scanner.next(); // 4
		scanner.next(); // 5
		scanner.next(); // 6
		String b = scanner.next(); // 7

		scanner.next(); // 8
		String c = scanner.next(); // 9
		scanner.next(); // 10

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}