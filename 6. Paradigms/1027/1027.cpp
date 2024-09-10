#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n, x, y;

    while (cin >> n) {
        vector<pair<int, int>> coord;
        coord.reserve(n);

        for (int i = 0; i < n; i++) {
            cin >> x >> y;
            coord.emplace_back(x, y);
        }

        sort(coord.begin(), coord.end());

        vector<int> top(n, 1), bottom(n, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (coord[i].first > coord[j].first) {
                    if (coord[i].second == coord[j].second + 2) {
                        top[i] = max(top[i], bottom[j] + 1);
                    } else if (coord[i].second == coord[j].second - 2) {
                        bottom[i] = max(bottom[i], top[j] + 1);
                    }
                }
            }
        }

        int max_length = 1;
        for (int i = 0; i < n; i++) {
            max_length = max({max_length, top[i], bottom[i]});
        }

        cout << max_length << endl;
    }

    return 0;
}