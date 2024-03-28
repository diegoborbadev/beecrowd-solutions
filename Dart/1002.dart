import 'dart:io';

void main() {
  String? input = stdin.readLineSync();
  if (input != null) {
    double r = double.parse(input);
    print("A=${(3.14159 * r * r).toStringAsFixed(4)}");
  }
}