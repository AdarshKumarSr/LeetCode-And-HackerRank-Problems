// Last updated: 6/17/2025, 10:50:25 AM
class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_set<int> sex; 
        for(int x : nums) {
            if(sex.count(x)) return true;
            sex.insert(x);
        }
        return false;
    }
};