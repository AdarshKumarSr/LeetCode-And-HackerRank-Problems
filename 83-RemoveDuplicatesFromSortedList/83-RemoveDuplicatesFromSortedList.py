# Last updated: 6/17/2025, 8:58:36 AM
# Definition for singly-linked list.
class ListNode:
    def _init_(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr = head
        while curr and curr.next:
            if curr.val == curr.next.val:
                curr.next = curr.next.next

            else:
                curr = curr.next
        return head