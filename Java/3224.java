import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		String j = scanner.next();
		String d = scanner.next();
		
        System.out.println(j.length() >= d.length() ? "go" : "no");
	}
}