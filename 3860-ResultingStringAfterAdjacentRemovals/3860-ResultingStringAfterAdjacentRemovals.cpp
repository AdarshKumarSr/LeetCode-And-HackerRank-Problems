// Last updated: 6/17/2025, 8:58:07 AM
class Solution {
public:
    string resultingString(string s) {
        stack<char> st;

        for (char c : s) {
            if (!st.empty()) {
                char top = st.top();
                if (abs(top - c) == 1 || (top == 'z' && c == 'a') || (top == 'a' && c == 'z')) {
                    st.pop();  // Remove consecutive pair
                    continue;
                }
            }
            st.push(c);
        }

        // Rebuild the result from stack
        string result;
        while (!st.empty()) {
            result += st.top();
            st.pop();
        }
        reverse(result.begin(), result.end());
        return result;
    }
};
