/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
       ListNode slow = head,fast = head;
       while(fast!=null&&fast.next!=null){
           slow = slow.next ;
           fast = fast.next.next;
       }
       fast = slow.next;
       slow.next = null;
       fast =  reverseList(fast);
       merge(head,fast);
    }
    
    public void merge(ListNode list1,ListNode list2){
        ListNode pre = new ListNode(0),curNode = pre;
        while(list1!=null&&list2!=null){
            curNode.next = list1;
            list1 = list1.next;
            curNode  = curNode.next;
            curNode.next = list2;
            list2 = list2.next;
            curNode = curNode.next;
        }
        if(list1!=null){
            curNode.next = list1;
        }else{
            curNode.next = null;
        }
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