// Last updated: 6/17/2025, 8:58:54 AM
class Solution {
public:

    bool isValid(string s) {
        stack<char> a;
        for( char c: s) {
            if(c=='{' || c=='[' || c=='('){
                a.push(c);
            }
            else if(c=='}' || c==']' || c==')'){
                if(a.empty()) return false;
                char b = a.top();
                a.pop();

                if(b=='{' && c!='}' ||
                   b=='[' && c!=']' ||
                   b=='(' && c!=')'){
                        return false;
                   }
            }
                
        }
        return a.empty();
    }

};

