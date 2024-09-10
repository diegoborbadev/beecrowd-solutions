import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if(n%2 == 0) {
			n++;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(n);
			n+=2;
		}
	}
}