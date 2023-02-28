import scala.math.{log10, Pi, floor}

object Main {
    def main(args: Array[String]) {
        val n = scala.io.StdIn.readInt()
        
        val r = floor(n * log10(n / math.E) + log10(2 * Pi * n) / 2 + 1).toInt
        println(r)
    }
}