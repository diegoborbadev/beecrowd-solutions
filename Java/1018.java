import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		System.out.println(n);

		int r = n;

		int n100 = r / 100;
		r -= n100 * 100;
		System.out.println(n100 + " nota(s) de R$ 100,00");

		int n50 = r / 50;
		r -= n50 * 50;
		System.out.println(n50 + " nota(s) de R$ 50,00");

		int n20 = r / 20;
		r -= n20 * 20;
		System.out.println(n20 + " nota(s) de R$ 20,00");

		int n10 = r / 10;
		r -= n10 * 10;
		System.out.println(n10 + " nota(s) de R$ 10,00");

		int n5 = r / 5;
		r -= n5 * 5;
		System.out.println(n5 + " nota(s) de R$ 5,00");

		int n2 = r / 2;
		r -= n2 * 2;
		System.out.println(n2 + " nota(s) de R$ 2,00");

		int n1 = r;
		System.out.println(n1 + " nota(s) de R$ 1,00");
    }
}