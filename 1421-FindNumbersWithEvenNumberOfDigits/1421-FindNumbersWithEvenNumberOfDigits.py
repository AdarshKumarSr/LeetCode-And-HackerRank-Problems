# Last updated: 6/17/2025, 8:58:06 AM
class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        check = []
        for i in nums:
            if len(str(i)) % 2 == 0:
                check.append(len(str(i)))
        return len(check)

        