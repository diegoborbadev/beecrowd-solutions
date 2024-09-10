import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%.2f\n", (double) sc.nextInt()/(sc.nextInt() + sc.nextInt()));
	}
}