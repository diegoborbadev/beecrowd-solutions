import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		float n = scanner.nextFloat();
		float m = scanner.nextFloat();
		
        System.out.println(String.format("MEDIA = %.5f", ((n * 3.5) + (m * 7.5)) / 11)); 
	}
}