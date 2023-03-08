import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();
		double r = 3.14159 * (n * n);
		System.out.println(String.format("A=%.4f", r)); 
	}
}