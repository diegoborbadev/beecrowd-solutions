using System; 
class URI {
    static void Main(string[] args) { 
        double r, v;

        r = double.Parse(Console.ReadLine());
        v = (4 / 3.0) * 3.14159 * r * r * r;

        Console.WriteLine("VOLUME = " + v.ToString("F3"));
    }
}