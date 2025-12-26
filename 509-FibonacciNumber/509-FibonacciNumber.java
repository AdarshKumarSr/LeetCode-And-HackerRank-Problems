// Last updated: 12/27/2025, 12:08:34 AM
1class Solution {
2    public int fib(int n) {
3        if(n==0) return 0;
4        if(n==1) return 1;
5
6        return fib(n-1)+fib(n-2);
7        
8    }
9}