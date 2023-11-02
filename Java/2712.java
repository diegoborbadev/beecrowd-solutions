import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] days = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"};
        
        int n = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < n; i++) {
            String p = scanner.nextLine().trim();
            
            if (ver(p)) {
                char l = p.charAt(7);
                int d;
                
                if (l == '1' || l == '2') {
                    d = 0;
                } else if (l == '3' || l == '4') {
                    d = 1;
                } else if (l == '5' || l == '6') {
                    d = 2;
                } else if (l == '7' || l == '8') {
                    d = 3;
                } else {
                    d = 4;
                }
                
                System.out.println(days[d]);
            } else {
                System.out.println("FAILURE");
            }
        }
        
        scanner.close();
    }
    
    public static boolean ver(String p) {
        if (p.length() != 8) {
            return false;
        }
        
        if (p.charAt(3) != '-') {
            return false;
        }
        
        int k = 0;
        for (int i = 0; i < 3; i++) {
            char c = p.charAt(i);
            if (Character.isLetter(c) && Character.isUpperCase(c)) {
                k++;
            }
        }
        
        if (k != 3) {
            return false;
        }
        
        for (int i = 4; i < 8; i++) {
            char c = p.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        
        return true;
    }
}