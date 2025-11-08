// Last updated: 11/9/2025, 3:11:02 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = Integer.MAX_VALUE;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] < arr[mid +1]){
                start = mid + 1;
            } else if (arr[mid] > arr[mid+1]) {
                max = mid;
                end = mid - 1;
            } else {
                max = mid;
            }
        }

        return max;
    }
}
