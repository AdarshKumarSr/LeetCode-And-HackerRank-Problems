// Last updated: 7/6/2025, 7:31:37 PM
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        // to store the anagam_map;
        unordered_map<string, vector<string>> anagram_map;

        for(string& words : strs) {  // runs loop over input
            string sorted = words;
            sort(sorted.begin(), sorted.end());
            anagram_map[sorted].push_back(words);
        }

        vector<vector<string>> resl;
        for(auto& entry : anagram_map){
            resl.push_back(entry.second);
        }

        return resl;
        
    }
};