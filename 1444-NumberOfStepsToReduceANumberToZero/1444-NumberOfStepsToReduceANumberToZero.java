// Last updated: 6/17/2025, 8:58:03 AM
class Solution {
    public int numberOfSteps(int num) {
        // even odd
        int count = 0;
       while(num > 0){
         if (num % 2 == 0){
            num = num/2; 
        }
        else {
            num = num-1; 
        }
        count++;
       }
        return count;
    }
}