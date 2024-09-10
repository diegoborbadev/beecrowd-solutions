#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    float x;
    
    cin >> x;
    
    cout << fixed << setprecision(2);
    cout << x * 6.28 << endl;

    return 0;
}