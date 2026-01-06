# Last updated: 1/7/2026, 1:23:55 AM
1from typing import List, Optional
2class Solution:
3    def mergeTwoLists(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
4        if not l1:
5            return l2
6        if not l2:
7            return l1
8
9        if l1.val < l2.val:
10            l1.next = self.mergeTwoLists(l1.next, l2)
11            return l1
12        else:
13            l2.next = self.mergeTwoLists(l1, l2.next)
14            return l2
15
16    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
17        if not lists:
18            return None
19        return self.divideAndConquer(lists, 0, len(lists) - 1)
20
21    def divideAndConquer(self, lists: List[Optional[ListNode]], left: int, right: int) -> Optional[ListNode]:
22        if left == right:
23            return lists[left]
24
25        mid = left + (right - left) // 2
26        l1 = self.divideAndConquer(lists, left, mid)
27        l2 = self.divideAndConquer(lists, mid + 1, right)
28        return self.mergeTwoLists(l1, l2)