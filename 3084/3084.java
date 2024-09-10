import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            System.out.printf("%02d:%02d%n", scanner.nextInt()/ 30, scanner.nextInt()/ 6);
        }
    }
}