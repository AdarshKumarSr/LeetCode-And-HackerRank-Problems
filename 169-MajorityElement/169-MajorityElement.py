# Last updated: 6/17/2025, 8:58:24 AM
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums.sort()
        n = len(nums)
        return nums[n//2]