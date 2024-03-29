object Main {
    def main(args: Array[String]) {
        val a = scala.io.StdIn.readDouble()
        val b = scala.io.StdIn.readDouble()
        val c = scala.io.StdIn.readDouble()
        val r = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0
        println(f"MEDIA = $r%.1f")
    }
}