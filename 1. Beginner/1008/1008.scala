object Main {
    def main(args: Array[String]) {
        val n = io.StdIn.readLine().toInt
        val m = io.StdIn.readLine().toInt
        val s = scala.io.StdIn.readDouble()
        
        println(f"NUMBER = $n\nSALARY = U$$ ${s * m}%.2f")
    }
}