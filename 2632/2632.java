import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, HashMap<String, Integer>> tipo = new HashMap<>();
        tipo.put("fire", new HashMap<String, Integer>() {{
            put("dmg", 200);
            put("n1", 20);
            put("n2", 30);
            put("n3", 50);
        }});
        tipo.put("water", new HashMap<String, Integer>() {{
            put("dmg", 300);
            put("n1", 10);
            put("n2", 25);
            put("n3", 40);
        }});
        tipo.put("earth", new HashMap<String, Integer>() {{
            put("dmg", 400);
            put("n1", 25);
            put("n2", 55);
            put("n3", 70);
        }});
        tipo.put("air", new HashMap<String, Integer>() {{
            put("dmg", 100);
            put("n1", 18);
            put("n2", 38);
            put("n3", 60);
        }});

        int numCases = scanner.nextInt();
        for (int g = 0; g < numCases; g++) {
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            int x0 = scanner.nextInt();
            int y0 = scanner.nextInt();
            scanner.nextLine();
            String[] e = scanner.nextLine().split(" ");
            int n = Integer.parseInt(e[1]);
            int cx = Integer.parseInt(e[2]);
            int cy = Integer.parseInt(e[3]);

            HashMap<String, Integer> enumMap = tipo.get(e[0]);
            int dmg = enumMap.get("dmg");
            String ns = "n" + n;
            int r = enumMap.get(ns);
            boolean proc = x0 > cx || cx > x0 + w || y0 > cy || cy > y0 + h;

            if (proc) {
                int c1 = (y0 - cy) * (y0 - cy);
                int c2 = (y0 + h - cy) * (y0 + h - cy);
                int r2 = r * r;
                for (int px = x0; px <= x0 + w; px++) {
                    int d1 = (px - cx) * (px - cx) + c1;
                    int d2 = (px - cx) * (px - cx) + c2;
                    if (r2 >= d1 || r2 >= d2) {
                        proc = false;
                        break;
                    }
                }
                if (proc) {
                    int c1x = (x0 - cx) * (x0 - cx);
                    int c2x = (x0 + w - cx) * (x0 + w - cx);
                    for (int py = y0; py <= y0 + h; py++) {
                        int d1 = c1x + (py - cy) * (py - cy);
                        int d2 = c2x + (py - cy) * (py - cy);
                        if (r2 >= d1 || r2 >= d2) {
                            proc = false;
                            break;
                        }
                    }
                }
            }

            if (proc) {
                System.out.println(0);
            } else {
                System.out.println(dmg);
            }
        }
    }
}