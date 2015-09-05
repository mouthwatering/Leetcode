/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curp = head,curq = head;
        int length =0;
        while(curp!=null){
            length++;
            curp = curp.next;
        }
        if(length%2==1){
            length = (length-1)/2;
        }else {
            length = length/2;
        }
        int i = length;
        while(i-->0){
            curq = curq.next;
        }
        curq = reverseList(curq);
        curp = head;
        while(length-->0){
            if(curq.val!=curp.val){
                return false;
            }
            curp = curp.next;
            curq = curq.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
         ListNode newHead = null;
        //iterative
        while(head!=null){
            ListNode tmp = head;
            head =head.next;// move the current pointer must be here£¬otherwise the pointer will be changed
            tmp.next=newHead;
            newHead=tmp;
         }
        return newHead; 
    }
}