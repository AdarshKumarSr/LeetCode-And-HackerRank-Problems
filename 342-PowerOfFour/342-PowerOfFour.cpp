// Last updated: 7/16/2025, 9:33:45 PM
class Solution {
public:
    bool isPowerOfFour(int n) {
        if( n <= 0){
            return false;
        }
        while (n % 4 ==0 ){
            n = n/4;
        }
        return n == 1;
    }
};