# Last updated: 6/17/2025, 8:58:41 AM
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        # rstrip() - to remove trailing whitespaces
        s = s.rstrip()
        if not s:
            return 0

        i = len(s) - 1
        count = 0

        while i >=0 and s[i] != ' ':
            count = count + 1
            i = i - 1

        return count