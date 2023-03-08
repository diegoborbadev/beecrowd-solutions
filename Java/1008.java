import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m =scanner.nextInt();
		float s = scanner.nextFloat();
		
        System.out.println(String.format("NUMBER = %d", n)); 
        System.out.println(String.format("SALARY = U$ %.2f", m * s)); 
	}
}