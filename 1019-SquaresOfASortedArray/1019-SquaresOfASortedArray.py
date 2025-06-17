# Last updated: 6/17/2025, 8:58:10 AM
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        squared_value = [i**2 for i in nums]
        squared_value.sort()
        return squared_value
       