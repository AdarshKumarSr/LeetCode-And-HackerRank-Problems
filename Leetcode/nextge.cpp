#include <iostream>
#include <stack>
using namespace std;

int main() {
    int n;
    cout << "Enter number of elements: ";
    cin >> n;

    int arr[n];
    int nge[n]; // Array to store next greater elements

    cout << "Enter elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
        nge[i] = -1; // Initialize all as -1
    }

    stack<int> st;

    // Traverse from right to left
    for (int i = n - 1; i >= 0; i--) {
        // Remove elements smaller than or equal to current
        while (!st.empty() && st.top() <= arr[i]) {
            st.pop();
        }

        // If stack is not empty, top is next greater
        if (!st.empty()) {
            nge[i] = st.top();
        }

        // Push current element to stack
        st.push(arr[i]);
    }

    cout << "Next Greater Elements: ";
    for (int i = 0; i < n; i++) {
        cout << nge[i] << " ";
    }

    return 0;
}