#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    double a,b,r;

    cin >> a;
    cin >> b;
    cout << fixed << setprecision(5);
    cout << "MEDIA = " << (a * 3.5 + b * 7.5) / 11 << endl;

    return 0;
}