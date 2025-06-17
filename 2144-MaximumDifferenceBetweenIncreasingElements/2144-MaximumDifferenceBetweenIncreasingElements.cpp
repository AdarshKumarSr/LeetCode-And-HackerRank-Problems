// Last updated: 6/17/2025, 8:58:05 AM
class Solution {
public:
    int maximumDifference(vector<int>& nums) {
        int minn = nums[0];
        int maxdiff = -1;
        for(int i=1; i<nums.size(); i++) {
           if(nums[i] > minn ){
            maxdiff = max(maxdiff ,nums[i] - minn);
           }else{
            minn = nums[i];
           }
        }
        return maxdiff;
    }      
};