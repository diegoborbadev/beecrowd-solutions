import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int d;
        int m;
        int y;
        
		d = scanner.nextInt();
		
		if (d >= 365){
			y = d / 365;
			d = d % 365;
			System.out.printf("%d ano(s)\n", y);
		} else{
			System.out.printf("0 ano(s)\n");
		}
		
		if (d >= 30){
			m = d / 30;
			d = d % 30;
			System.out.printf("%d mes(es)\n", m);
		} else{
			System.out.printf("0 mes(es)\n");
		}
		
		System.out.printf("%d dia(s)\n", d);
    }
}