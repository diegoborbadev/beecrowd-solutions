using System; 
class URI {
    static void Main(string[] args) {
        string[] l = Console.ReadLine().Split();
        int h = int.Parse(l[0]);
        int e = int.Parse(l[1]);
        int a = int.Parse(l[2]);
        int o = int.Parse(l[3]);
        int w = int.Parse(l[4]);
        int x = int.Parse(l[5]);

        if (h + e + a + x >= o + w) {
            Console.WriteLine("Middle-earth is safe.");
        } else {
            Console.WriteLine("Sauron has returned.");
        }
    }
}
