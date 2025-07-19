// Last updated: 7/19/2025, 7:30:35 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(IsEven(nums[i])){
                count++;
            }
        }
        return count;
    }
    public boolean IsEven(int i){
        int count = 0;
        while(i>0){
            i=i/10;
            count++;
        }

        if(count % 2 == 0){
             return true;
        }
    return false;
    }
}