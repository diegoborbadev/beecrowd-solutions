object Main {
    def main(args: Array[String]) {
        val jon: String = scala.io.StdIn.readLine()
        val doc: String = scala.io.StdIn.readLine()
        
        if (jon.length >= doc.length) {
            println("go")
        } else {
            println("no")
        }
    }
}