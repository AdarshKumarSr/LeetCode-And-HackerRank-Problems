// Last updated: 6/17/2025, 12:33:08 PM
class Solution {
public:
    bool isAnagram(string s, string t) {
       if(s.length() != t.length()) return false;

       map<char, int> freq1, freq2;

       for(char c : s) freq1[c]++;
       for(char x : t) freq2[x]++;
       return freq1 == freq2;
    }
};