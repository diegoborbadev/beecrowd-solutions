import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();
		double x = scanner.nextDouble();
		System.out.println(String.format("%.2f", x / (n + 2))); 
	}
}