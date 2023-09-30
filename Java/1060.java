import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int r = 0;
		for (int i = 0; i < 6; i++) {
			if (scanner.nextFloat() > 0) {
				r++;
			}
		}

		System.out.printf("%d valores positivos\n", r);
	}
}