import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] coordinates = input.split(" ");

        int col_diff = Math.abs(coordinates[0].charAt(0) - coordinates[1].charAt(0));
        int line_diff = Math.abs(Character.getNumericValue(coordinates[0].charAt(1)) - Character.getNumericValue(coordinates[1].charAt(1)));

        if ((col_diff == 1 && line_diff == 2) || (col_diff == 2 && line_diff == 1)) {
            System.out.println("VALIDO");
        } else {
            System.out.println("INVALIDO");
        }
    }
}