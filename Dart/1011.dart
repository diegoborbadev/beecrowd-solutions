import 'dart:io';

void main() {
  double r = double.parse(stdin.readLineSync());
  print("VOLUME = ${((4 / 3.0) * 3.14159 * r * r * r).toStringAsFixed(3)}");
}