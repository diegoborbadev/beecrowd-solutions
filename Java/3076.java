import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.printf("%.0f%n" ,Math.ceil(scanner.nextInt() / 100.0));
        }
    }
}