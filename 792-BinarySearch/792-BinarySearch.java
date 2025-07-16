// Last updated: 7/16/2025, 9:33:43 PM
class Solution {
    public int search(int[] nums, int target) {
        for(int num = 0; num < nums.length; num++){
            if( nums[num] == target){
                return num ;
            }
        }
        return -1;
    }
}