// Last updated: 7/14/2025, 4:35:39 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while( n % 4  == 0){
            n = n/4;
        }
        return n == 1;
      
    }
}