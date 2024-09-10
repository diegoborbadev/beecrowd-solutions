import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				long n = scanner.nextLong();

				if (n == -1)break;
				
				System.out.println("0x" + Integer.toHexString((int) n).toUpperCase());

			} catch (Exception e) {
				String h = scanner.next().replaceAll("0x","");
				System.out.println(Integer.parseInt(h, 16));
			}
		}
	}
}