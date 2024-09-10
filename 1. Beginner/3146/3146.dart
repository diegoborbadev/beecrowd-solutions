import 'dart:io';

void main() {
    double x = double.parse(stdin.readLineSync()!);
    print((x * 6.28).toStringAsFixed(2));
}