#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    double n, x;

    cin >> n >> x;
    cout << fixed << setprecision(2);
    cout << x / (n + 2) << endl;

    return 0;
}