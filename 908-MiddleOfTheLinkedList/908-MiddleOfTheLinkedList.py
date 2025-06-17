# Last updated: 6/17/2025, 8:58:20 AM
class ListNode:
    def _init_(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:

        mid = pointer = head

        while pointer and pointer.next:
            mid= mid.next
            pointer= pointer.next.next
        return mid