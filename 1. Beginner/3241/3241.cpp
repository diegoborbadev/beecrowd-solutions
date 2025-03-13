#include <iostream>
#include <string>

using namespace std;

int main() {
    int n;
    cin >> n;
    cin.ignore();

    for (int i = 0; i < n; ++i) {
        string s;
        getline(cin, s);
        if (s == "P=NP") {
            cout << "skipped" << endl;
        } else {
            size_t plusPos = s.find('+');
            int a = stoi(s.substr(0, plusPos));
            int b = stoi(s.substr(plusPos + 1));
            cout << a + b << endl;
        }
    }
    
    return 0;
}