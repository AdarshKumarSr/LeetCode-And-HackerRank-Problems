// Last updated: 6/17/2025, 8:59:04 AM
class Solution {
    public int reverse(int x) {
        // basic-reverse enhanced with overflow (and underflow) condition

        int reverse=0;
        boolean isPositive=true;
        if(x>0){
            isPositive=true;
        }else{
            isPositive=false;
            x*=-1;
        }
        while(x>0){
            if(reverse > Integer.MAX_VALUE/10){
                return 0;
            }
            reverse=reverse*10 + x%10;
            x/=10;
        }
        return isPositive ? reverse : reverse*-1;
    }
}