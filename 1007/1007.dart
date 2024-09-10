import 'dart:io';

void main() {
  int a = int.parse(stdin.readLineSync());
  int b = int.parse(stdin.readLineSync());
  int c = int.parse(stdin.readLineSync());
  int d = int.parse(stdin.readLineSync());
  
  int r = a * b - c * d;
  print("DIFERENCA = $r");
}