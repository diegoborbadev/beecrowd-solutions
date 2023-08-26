import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        System.out.println(String.format("TRIANGULO: %.3f", a * c / 2.0));
        System.out.println(String.format("CIRCULO: %.3f", 3.14159 * (c * c)));
        System.out.println(String.format("TRAPEZIO: %.3f", ((a + b) * c) / 2));
        System.out.println(String.format("QUADRADO: %.3f",  b * b));
        System.out.println(String.format("RETANGULO: %.3f", a * b));  
    }
}