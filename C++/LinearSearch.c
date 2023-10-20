#include <iostream>
#include <vector>

int linearSearch(const std::vector<int>& arr, int target) {
    for (int i = 0; i < arr.size(); ++i) {
        if (arr[i] == target) {
            return i;
        }
    }
    
    return -1;
}

int main() {
    std::vector<int> arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
    int target = 7;

    int result = linearSearch(arr, target);

    if (result != -1) {
        std::cout << "Element found at index " << result << std::endl;
    } else {
        std::cout << "Element not found in the array." << std::endl;
    }

    return 0;
}
