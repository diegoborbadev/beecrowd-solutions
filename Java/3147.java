import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int g = 0;
        int e = 0;

        int i = 0;
        for(String item : scanner.nextLine().split(" ")) {
            if(i > 2 && i < 5){
                e += Integer.parseInt(item);
            } else {
                g += Integer.parseInt(item);
            }
            i++;
        }

        System.out.println(g > e ? "Middle-earth is safe." : "Sauron has returned.");
    }
}