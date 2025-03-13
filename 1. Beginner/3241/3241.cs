using System;

class URI {
    static void Main() {
        int n = int.Parse(Console.ReadLine());

        for (int i = 0; i < n; i++) {
            string s = Console.ReadLine();
            if (s == "P=NP") {
                Console.WriteLine("skipped");
            } else {
                string[] parts = s.Split('+');
                int a = int.Parse(parts[0]);
                int b = int.Parse(parts[1]);
                Console.WriteLine(a + b);
            }
        }
    }
}