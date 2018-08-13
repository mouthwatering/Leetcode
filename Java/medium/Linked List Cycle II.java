/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int k = hasCycle(head);
        if(k == 0){
            return null;
        }
        ListNode fast = head;
        while(k-->0){
            fast = fast.next;
        }
        ListNode slow = head;
        while(fast!=slow){
            fast= fast.next;slow = slow.next;
        }
        return slow;
    }
    public int hasCycle(ListNode head){
        ListNode slow = head,fast = head;
        int count = 0;
        while(slow !=null &&fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
            if(slow ==fast){
                return count;
            }
        }
        return 0;
    }
}