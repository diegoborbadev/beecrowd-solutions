import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();

        double volume = (4.0 / 3.0) * 3.14159 * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}