#include <iostream>

int main() {
    int h, e, a, o, w, x;
    std::cin >> h >> e >> a >> o >> w >> x;
    
    if (h + e + a + x >= o + w)
        std::cout << "Middle-earth is safe." << std::endl;
    else
        std::cout << "Sauron has returned." << std::endl;
    
    return 0;
}