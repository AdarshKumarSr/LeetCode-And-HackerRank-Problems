# Last updated: 6/17/2025, 8:58:37 AM
class Solution:
    def mySqrt(self, x: int) -> int:
        if x == 0 or x == 1:
            return x

        num = 2

        while True:
            sqaure = num * num

            if x == sqaure:
                return num
            
            if sqaure > x:
                return num - 1

            num += 1