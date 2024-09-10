import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double f1 = scanner.nextDouble();
        double f2 = scanner.nextDouble();

        double ft = ((1 + f1 / 100) * (1 + f2 / 100) - 1) * 100;
        
        System.out.printf("%.6f%n", ft);
    }
}