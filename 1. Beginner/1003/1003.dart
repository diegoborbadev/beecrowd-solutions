import 'dart:io';

void main() {
  int a = int.parse(stdin.readLineSync());
  int b = int.parse(stdin.readLineSync());
  
  int r = a + b;
  print("SOMA = $r");
}