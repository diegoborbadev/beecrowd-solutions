import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int K = leitor.nextInt();
        int[] notas = new int[N];
        int classificados = K;
        for (int i = 0; i < N; i++) {
        	notas[i] = leitor.nextInt();
        }
        sort(notas, 0, notas.length -1);
        for (int i = K-1; i < N; i++) {
        	if (i + 1 < notas.length && notas[i + 1] == notas[i]) classificados++;
        	else break;
        }
        System.out.println(classificados);
    }
    
	private static void sort(int[] v, int inicio, int fim) {
		int aux, down, up, pivo, i;
		pivo = v[inicio];
		down = inicio;
		up = fim;
		while (down < up) {
			while (v[down] >= pivo && down < fim)
				down++;
			while (v[up] < pivo && up > inicio)
				up--;
			if (down < up) {
				aux = v[down];
				v[down] = v[up];
				v[up] = aux;
			}
		}
		
		v[inicio] = v[up];
		v[up] = pivo;

		if (inicio < up && inicio != up - 1)
			sort(v, inicio, up - 1);

		if (fim > down && up + 1 != fim)
			sort(v, up + 1, fim);
	}
	
}