import 'dart:io';

void main() {
    var input = stdin.readLineSync();
    var values = input.split(' ').map(int.parse).toList();
    
    var h1 = values[0];
    var m1 = values[1];
    var h2 = values[2];
    var m2 = values[3];

    if (h2 <= h1 && m2 <= m1) {
        h2 += 24;
    } else if (m2 <= m1) {
        m2 += 60;
        h2 -= 1;
    }

    var t = ((h2 * 3600) + (m2 * 60)) - ((h1 * 3600) + (m1 * 60));
    var h = t ~/ 3600;
    var m = (t - (h * 3600)) ~/ 60;

    print("O JOGO DUROU $h HORA(S) E $m MINUTO(S)");
}