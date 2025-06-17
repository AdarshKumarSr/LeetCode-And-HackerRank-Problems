# Last updated: 6/17/2025, 8:59:03 AM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        x_str = str(x)
        return x_str == x_str[::-1]

        