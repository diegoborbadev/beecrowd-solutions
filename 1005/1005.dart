import 'dart:io';

void main() {
  double a = double.parse(stdin.readLineSync());
  double b = double.parse(stdin.readLineSync());
  print("MEDIA = ${((a * 3.5 + b * 7.5) / 11).toStringAsFixed(5)}");
}