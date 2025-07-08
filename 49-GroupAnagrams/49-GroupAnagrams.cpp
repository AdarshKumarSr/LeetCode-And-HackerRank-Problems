// Last updated: 7/8/2025, 4:55:56 PM
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
       unordered_map<string , vector<string>> anagram_map;

       for(string& words : strs){
        string sorted = words;
        sort(sorted.begin(), sorted.end());
        anagram_map[sorted].push_back(words);
       }

        vector<vector<string>> res;
        for(auto& entry  : anagram_map ){
            res.push_back(entry.second);
        }

        return res;
        
    }

};