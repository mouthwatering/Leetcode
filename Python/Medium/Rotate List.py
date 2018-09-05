# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def rotateRight(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        start = head;
        cur = head
        if head is None:
            return head
        N = 0
        while cur is not None:
            cur = cur.next
            N = N + 1
        k = k % N
        cur = head

        if k == 0:
            return head

        while (k > 0):
            if cur.next is None:
                cur = start
            else:
                cur = cur.next
            k = k - 1
        slow = head

        while (cur.next is not None):
            slow = slow.next;
            cur = cur.next;

        newstart = slow.next
        if newstart is None:
            return head

        slow.next = None
        cur.next = start

        return newstart