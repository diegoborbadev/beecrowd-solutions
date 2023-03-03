import scala.io.StdIn.readLine

object Main {
  def main(args: Array[String]) {
    val Array(h1, m1, h2, m2) = readLine().split(" ").map(_.toInt)

    var hh = h2
    var mm = m2
    if (h2 <= h1 && m2 <= m1) {
      hh += 24
    } else if (m2 <= m1) {
      mm += 60
      hh -= 1
    }

    val t = (hh * 3600) + (mm * 60) - (h1 * 3600) - (m1 * 60)
    val h = t / 3600
    val m = (t % 3600) / 60

    printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", h, m)
  }
}