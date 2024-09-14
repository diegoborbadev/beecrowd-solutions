#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int n, m;
    float s;
    std::cin >> n >> m >> s;
    
    cout << fixed << setprecision(2);
    std::cout << "NUMBER = " << n << std::endl;
    std::cout << "SALARY = U$ " << m * s << std::endl;
    
    return 0;
}