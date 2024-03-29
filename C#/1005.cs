using System;
class URI {
    static void Main(string[] args) {
        double a, b, r;

        a = double.Parse(Console.ReadLine());
        b = double.Parse(Console.ReadLine());
        r = (a * 3.5 + b * 7.5) / 11;

        Console.WriteLine("MEDIA = " + r.ToString("F5"));
    }
}