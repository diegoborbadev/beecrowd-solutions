import 'dart:io';

void main() {
  String jon = stdin.readLineSync()!;
  String doc = stdin.readLineSync()!;
  
  if (jon.length >= doc.length) {
    print("go");
  } else {
    print("no");
  }
}