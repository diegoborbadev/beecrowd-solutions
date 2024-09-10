import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("SOMA = %d", scanner.nextInt() + scanner.nextInt())); 
	}
}