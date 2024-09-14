import 'dart:io';

void main() {
  String? input = stdin.readLineSync();
  if (input != null) {
    List<String> values = input.split(' ');
    double n = double.parse(values[0]);
    double x = double.parse(values[1]);
    print("${(x / (n + 2)).toStringAsFixed(2)}");
  }
}