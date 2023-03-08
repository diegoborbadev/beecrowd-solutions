import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("PROD = %d", scanner.nextInt() * scanner.nextInt())); 
	}
}