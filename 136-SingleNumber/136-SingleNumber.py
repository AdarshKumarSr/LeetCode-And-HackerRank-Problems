# Last updated: 6/17/2025, 8:58:28 AM
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = 0
        for num in nums:
            result ^= num  # XOR all elements to find the unique one
        return result
