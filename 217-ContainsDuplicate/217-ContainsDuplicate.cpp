// Last updated: 6/17/2025, 10:36:54 AM
class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        for(int i=1; i<nums.size(); ++i){
            if(nums[i] == nums[i -1]){
                return true;
            }
        }
            return false;
    }
};