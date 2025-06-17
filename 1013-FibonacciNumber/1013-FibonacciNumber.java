// Last updated: 6/17/2025, 8:58:12 AM
class Solution {
    public int fib(int n) {

        if (n == 0) return 0; // Base case
        if (n == 1) return 1; // Base case

        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n){
            int temp = b;
            b = a+b;
            a = temp;
            count ++;
        }
        return b;
    }
    public static void main(String[] args){
            Solution sol = new Solution();
            System.out.println(sol.fib(7));

        }
    }
