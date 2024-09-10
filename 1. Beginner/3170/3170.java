import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		long n = scanner.nextLong();
		long m = scanner.nextLong();
		int r = (int) Math.floor(m / 2 - n);
		
        System.out.println(r > 0 ? "Faltam " + r + " bolinha(s)" : "Amelia tem todas bolinhas!");
	}
}