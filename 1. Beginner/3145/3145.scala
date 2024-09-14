object Main {
    def main(args: Array[String]) {
        val input = scala.io.StdIn.readLine()
        val Array(n, x) = input.split(" ").map(_.toDouble)
        val r = x / (n + 2)
        println(f"$r%.2f")
    }
}