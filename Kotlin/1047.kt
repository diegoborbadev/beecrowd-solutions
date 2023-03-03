import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val h1 = scanner.nextInt()
    val m1 = scanner.nextInt()
    var h2 = scanner.nextInt()
    var m2 = scanner.nextInt()

    var t: Int
    var h: Int
    var m: Int

    if (h2 <= h1 && m2 <= m1) {
        h2 += 24
    } else if (m2 <= m1) {
        m2 += 60
        h2 -= 1
    }

    t = ((h2 * 3600) + (m2 * 60)) - ((h1 * 3600) + (m1 * 60))
    h = t / 3600
    m = (t - (h * 3600)) / 60

    println("O JOGO DUROU $h HORA(S) E $m MINUTO(S)")
}