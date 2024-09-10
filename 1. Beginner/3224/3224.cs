using System; 
class URI {
    static void Main(string[] args) { 
        string j = Console.ReadLine();
        string d = Console.ReadLine();

        Console.WriteLine(j.Length >= d.Length ? "go" : "no");
    }
}