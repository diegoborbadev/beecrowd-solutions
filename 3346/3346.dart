import 'dart:io';

void main() {
    double f1, f2, ft;

    String? input = stdin.readLineSync();
    List<String> s = input != null ? input.split(' ') : [];
    f1 = double.parse(s[0]);
    f2 = double.parse(s[1]);

    ft = ((1 + f1 / 100) * (1 + f2 / 100) - 1) * 100;

    print(ft.toStringAsFixed(6));
}