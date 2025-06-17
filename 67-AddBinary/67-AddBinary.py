# Last updated: 6/17/2025, 8:58:38 AM
class Solution(object):
    def addBinary(self, a, b):
        result = []
        carry = 0
        i, j = len(a) - 1, len(b) - 1

        while i >= 0 or j >= 0 or carry:
            digit_a = int(a[i]) if i >= 0 else 0
            digit_b = int(b[j]) if j >= 0 else 0
            total = digit_a + digit_b + carry
            result.append(str(total % 2))  # Append the current bit
            carry = total // 2  # Update the carry
            i, j = i - 1, j - 1

        return ''.join(reversed(result))
