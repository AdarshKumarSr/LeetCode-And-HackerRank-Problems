# Last updated: 6/17/2025, 8:58:21 AM
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        while True:
            if n == 2 or n == 1:
                return True
            elif n == 0:
                return False
            elif n % 2 == 0:
                n = n / 2
            else:
                return False