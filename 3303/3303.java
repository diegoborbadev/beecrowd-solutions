import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                if (scanner.nextLine().length() >= 10) {
                    System.out.println("palavrao");
                } else {
                    System.out.println("palavrinha");
                }
            } catch (Exception e) {
                break;
            }
        }
	}
}