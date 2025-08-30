# Last updated: 8/31/2025, 12:51:39 AM
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums.sort()
        n = len(nums)
        return nums[n//2]