# Last updated: 6/17/2025, 8:58:19 AM
class Solution:
    def numSquares(self, n: int) -> int:
        l = [0]
        for i in range(1, n+1):
            curr = i
            for j in range(1, i):
                if j ** 2>i:
                    break
                else:
                    if l[i-j**2]+1 < curr:
                        curr = l[i-j**2]+1
            l.append(curr)
        return l[-1]