using System; 
class URI {
    static void Main(string[] args) { 
        int n, x;
        double r;

        string[] inputs = Console.ReadLine().Trim().Split(' ');
        n = Int32.Parse(inputs[0]);
        x = Int32.Parse(inputs[1]);
        
        r = (double) x / (n + 2);

        Console.WriteLine(r.ToString("F2"));
    }
}