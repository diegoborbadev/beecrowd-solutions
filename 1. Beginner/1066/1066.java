import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int even = 0;
		int odd = 0;
		int pos = 0;
		int neg = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			int x = scanner.nextInt();

			if (x > 0) {
				pos++;
			} else if (x < 0) {
				neg++;
			}

			if (x % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		System.out.printf("%d valor(es) par(es)\n", even);
		System.out.printf("%d valor(es) impar(es)\n", odd);
		System.out.printf("%d valor(es) positivo(s)\n", pos);
		System.out.printf("%d valor(es) negativo(s)\n", neg);
	}
}