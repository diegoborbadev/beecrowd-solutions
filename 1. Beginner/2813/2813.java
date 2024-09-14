import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int hu = 0;
		int hb = 0;

		int wu = 0;
		int wb = 0;

		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			String sd = scanner.next();
			String sn = scanner.next();
			if (sd.equalsIgnoreCase("chuva")) {
				if (hu < 1) {
					hb += 1;
				} else {
					hu -= 1;
				}
				wu += 1;
			}
			if (sn.equalsIgnoreCase("chuva")) {
				if (wu < 1) {
					wb += 1;
				} else {
					wu -= 1;
				}
				hu += 1;
			}
		}

		System.out.printf("%d %d%n", hb, wb);
	}
}