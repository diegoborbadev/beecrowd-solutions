import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
       
        int h = t / 3600;
        t -= h * 3600;
       
        int m = t / 60;
        t -= m * 60;
        
        int s = t;
        
        System.out.println(h + ":" + m + ":" + s);	

        scanner.close();
    }
}