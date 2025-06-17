// Last updated: 6/17/2025, 12:06:57 PM
class Solution {
public:
    bool isAnagram(string s, string t) {
        sort(s.begin(), s.end());
        sort(t.begin(), t.end());

        if(s==t){
            return true;
        }
        else return false;

    }
};