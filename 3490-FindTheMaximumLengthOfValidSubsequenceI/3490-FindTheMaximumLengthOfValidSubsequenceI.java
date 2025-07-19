// Last updated: 7/19/2025, 7:30:16 PM
class Solution {
    public int maximumLength(int[] nums) {
        int countEven = 0, countOdd = 0;

        for (int num : nums) {
            if (num % 2 == 0) countEven++;
            else countOdd++;
        }

        // Case 1: All evens or all odds (same parity subsequence)
        int sameParityMax = Math.max(countEven, countOdd);

        // Case 2: Alternating parity subsequence
        int altCount = 1;
        int last = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] + last) % 2 == 1) { // different parity
                altCount++;
                last = nums[i];
            }
        }

        return Math.max(sameParityMax, altCount);
    
    }
}