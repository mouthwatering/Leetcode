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
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head,fast;
        if(head.next == null){
            return false;
        }else{
            fast= head.next;
        }
            
        while(slow!=null&&fast!=null&&fast.next!=null){
            if(slow.val ==fast.val){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}