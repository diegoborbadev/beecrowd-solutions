import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
		double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        
        if ((A == 0) | (B * B - 4 * A * C < 0)) {
			System.out.println("Impossivel calcular");
			return;
		}
        
        double r = Math.sqrt((B * B) - 4 * A * C);
        
        System.out.printf("R1 = %.5f\n", (-B + r) / (2 * A));
        System.out.printf("R2 = %.5f\n", (-B - r) / (2 * A));

		scanner.close();
	}
}