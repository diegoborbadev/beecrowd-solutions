import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();

		int[] arr = new int[N];
		int r = K;

		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}

		sort(arr, 0, arr.length - 1);

		for (int i = K - 1; i < N; i++) {
			if (i + 1 < arr.length && arr[i + 1] == arr[i])
				r++;
			else
				break;
		}

		System.out.println(r);
	}

	private static void sort(int[] v, int inicio, int fim) {
		int aux, down, up, p, i;
		p = v[inicio];
		down = inicio;
		up = fim;
		while (down < up) {
			while (v[down] >= p && down < fim)
				down++;
			while (v[up] < p && up > inicio)
				up--;
			if (down < up) {
				aux = v[down];
				v[down] = v[up];
				v[up] = aux;
			}
		}

		v[inicio] = v[up];
		v[up] = p;

		if (inicio < up && inicio != up - 1)
			sort(v, inicio, up - 1);

		if (fim > down && up + 1 != fim)
			sort(v, up + 1, fim);
	}
}