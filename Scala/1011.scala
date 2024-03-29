object Main {
    def main(args: Array[String]) {
        val r = scala.io.StdIn.readDouble()
        val v = (4 / 3.0) * 3.14159 * r * r * r
        println(f"VOLUME = $v%.3f")
    }
}