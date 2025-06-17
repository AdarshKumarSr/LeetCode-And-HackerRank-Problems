# Last updated: 6/17/2025, 8:58:17 AM
class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        while True:
            if n == 3 or n == 1:
                return True
            elif n == 0:
                return False
            elif n % 3 == 0:
                n = n / 3
            else:
                return False
# print(Solution().isPowerOfTwo(1)) # True