import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();
		
        System.out.println(String.format("MEDIA = %.1f", ((a * 2) + (b * 3) + (c * 5)) /10)); 
	}
}