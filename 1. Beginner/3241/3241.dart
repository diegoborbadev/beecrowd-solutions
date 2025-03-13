import 'dart:io';

void main() {
    int n = int.parse(stdin.readLineSync()!);

    for (int i = 0; i < n; i++) {
        String s = stdin.readLineSync()!;
        if (s == 'P=NP') {
            print('skipped');
        } else {
            List<String> parts = s.split('+');
            int a = int.parse(parts[0]);
            int b = int.parse(parts[1]);
            print(a + b);
        }
    }
}