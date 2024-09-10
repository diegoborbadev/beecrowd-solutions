import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] namesList = new String[26][n];
        int[] namesIndex = new int[26];
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int index = Character.toLowerCase(name.charAt(0)) - 'a';
            namesList[index][namesIndex[index]++] = name;
        }
        for (String[] names : namesList) {
            if (names != null) {
                for (String name : names) {
                    if (name != null) {
                        System.out.println(name);
                    }
                }
            }
        }
    }
}