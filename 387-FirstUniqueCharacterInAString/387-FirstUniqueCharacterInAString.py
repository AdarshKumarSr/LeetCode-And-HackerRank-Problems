# Last updated: 6/17/2025, 8:58:14 AM
class Solution:
    def firstUniqChar(self, s: str) -> int:
        n = len(s)
        
        # Iterate through each character in the string
        for i in range(n):
            count = 0
            
            # Check for duplicates before the current index
            for k in range(0, i):
                if s[i] == s[k]:
                    count = 1
                    break
            
            # If no duplicates before, check after the current index
            if count == 0:
                for j in range(i + 1, n):
                    if s[i] == s[j]:
                        count = 1
                        break
            
            # If no duplicates found, return the current index
            if count == 0:
                return i
        
        # If no unique character is found, return -1
        return -1