using System;
class URI {
    static void Main(string[] args) {
        double a, b, c, r;

        a = double.Parse(Console.ReadLine());
        b = double.Parse(Console.ReadLine());
        c = double.Parse(Console.ReadLine());
        r = (a * 2 + b * 3 + c * 5) / 10;

        Console.WriteLine("MEDIA = " + r.ToString("F1"));
    }
}