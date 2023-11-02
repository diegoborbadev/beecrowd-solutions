import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int tipo = 0;
		int alc = 0;
		int gas = 0;
		int die = 0;

		Scanner sc = new Scanner(System.in);

		while (tipo != 4) {
			tipo = sc.nextInt();

			while (tipo < 1 || tipo > 4) {
				tipo = sc.nextInt();
			}

			switch (tipo) {
			case 1:
				alc++;
				break;
			case 2:
				gas++;
				break;
			case 3:
				die++;
				break;
			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);
	}
}