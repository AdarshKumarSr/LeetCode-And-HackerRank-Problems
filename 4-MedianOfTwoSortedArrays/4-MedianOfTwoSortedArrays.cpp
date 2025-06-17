// Last updated: 6/17/2025, 8:59:05 AM
#include<sstream>
class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        nums1.insert(nums1.end(), nums2.begin() , nums2.end()); // added num2 behind num1 .

        sort(nums1.begin(), nums1.end()); // sorted num1 .

        int n = nums1.size();
        int mid = (0 + n-1)/2;

        if (n%2 == 0) {
            stringstream ss;
            ss << fixed << setprecision(5) << ((nums1[mid] + nums1[mid+1])/2.0);
            float res;
            ss >> res;
            return res;
            
        } else {
            stringstream ss;
            ss << fixed << setprecision(5) << nums1[mid];
            float res;
            ss >> res;
            return res;
            
        }
    }
};