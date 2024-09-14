import 'dart:io';

void main() {
  int n = int.parse(stdin.readLineSync()!)!;
  int m = int.parse(stdin.readLineSync()!)!;
  double s = double.parse(stdin.readLineSync()!)!;
  
  print("NUMBER = $n\nSALARY = U\$ ${(m! * s!).toStringAsFixed(2)}");
}