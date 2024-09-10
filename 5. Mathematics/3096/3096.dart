import 'dart:io';
import 'dart:math';

double log10(num x) => log(x) / ln10;

void main() {
  int n = int.parse(stdin.readLineSync());
  
  double r = n*log10(n/e) + log10(2*pi*n)/2.0;
  print("${r.floor() + 1}");
}