using System; 
class URI {

    static void Main(string[] args) { 
        double f1, f2, ft;

        string[] s = Console.ReadLine().Split(' ');
        f1 = double.Parse(s[0]);
        f2 = double.Parse(s[1]);

        ft = ((1 + f1 / 100) * (1 + f2 / 100) - 1) * 100;

        Console.WriteLine(ft.ToString("F6"));
    }
}