using System; 
class URI {
    static void Main(string[] args) { 
        int n = Int32.Parse(Console.ReadLine());
        int m = Int32.Parse(Console.ReadLine());
        float s = float.Parse(Console.ReadLine());
       
        Console.Write("NUMBER = {0}\nSALARY = U$ {1}\n", n, (m *s).ToString("F2"));
    }
}