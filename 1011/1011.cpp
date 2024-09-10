#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    double r;

    cin >> r;
    cout << fixed << setprecision(3);
    cout << "VOLUME = " << (4 / 3.0) * 3.14159 * r * r * r << endl;

    return 0;
}