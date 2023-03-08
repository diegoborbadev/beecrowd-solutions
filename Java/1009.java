import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		scanner.next();
		System.out.println(String.format("TOTAL = R$ %.2f", scanner.nextFloat() + scanner.nextFloat() * 0.15)); 
	}
}