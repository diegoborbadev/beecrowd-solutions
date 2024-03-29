object Main {
    def main(args: Array[String]) {
        val a = scala.io.StdIn.readDouble()
        val b = scala.io.StdIn.readDouble()
        val r = (a * 3.5 + b * 7.5) / 11
        println(f"MEDIA = $r%.5f")
    }
}