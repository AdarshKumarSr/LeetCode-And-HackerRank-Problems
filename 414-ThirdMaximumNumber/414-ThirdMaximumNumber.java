// Last updated: 6/17/2025, 8:58:13 AM
import java.util.HashSet;

class Solution {
    public int thirdMax(int[] arr) {
        long max = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int num : arr) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
                if (num > max) {
                    third = second;
                    second = max;
                    max = num;
                } else if (num > second) {
                    third = second;
                    second = num;
                } else if (num > third) {
                    third = num;
                }
            }
        }

        // If we found at least three distinct numbers, return third max
        return (uniqueNumbers.size() >= 3) ? (int) third : (int) max;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Third Largest: " + sol.thirdMax(arr));

        int[] arr2 = {5, 5, 5, 5}; // Only one unique number
        System.out.println("Third Largest: " + sol.thirdMax(arr2)); // Should return 5
    }
}
