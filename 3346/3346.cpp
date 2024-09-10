#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    double f1, f2, ft;

    cout << fixed << setprecision(2);
    cin >> f1 >> f2;

    ft = ((1 + f1 / 100) * (1 + f2 / 100) - 1) * 100;

    cout << fixed << setprecision(6);
    cout << ft << endl;
    return 0;
}