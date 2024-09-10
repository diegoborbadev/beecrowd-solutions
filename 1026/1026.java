import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
		
    	while (scanner.hasNext()) {
    		long n = scanner.nextLong();
    		long m = scanner.nextLong();
    		System.out.println(n ^ m);
    	}
    }
}