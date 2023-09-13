import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
		DecimalFormat df = new DecimalFormat("0.0");
        
		double r = ((scanner.nextDouble() * 2) + (scanner.nextDouble() * 3) + (scanner.nextDouble() * 4) + (scanner.nextDouble() * 1)) / 10;
        
		System.out.println("Media: " + df.format(r));
        if (r >= 7) {
            System.out.println("Aluno aprovado.");
        
		} else if (r < 7 && r >= 5) {
            System.out.println("Aluno em exame.");
            
			double e = scanner.nextDouble();
            
			System.out.println("Nota do exame: " + df.format(e));
            
			r = (r + e) / 2;
            
			if (r >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            
			System.out.println("Media final: " + df.format(r));
        
		} else {
            System.out.println("Aluno reprovado.");
        }
    }
}