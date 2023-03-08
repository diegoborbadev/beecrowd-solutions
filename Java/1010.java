import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		scanner.next();
		int n1 = scanner.nextInt();
		float m1 = scanner.nextFloat();
		
		scanner.next();
		int n2 = scanner.nextInt();
		float m2 = scanner.nextFloat();
		
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", (n1 * m1) + (n2 * m2))); 
	}
}