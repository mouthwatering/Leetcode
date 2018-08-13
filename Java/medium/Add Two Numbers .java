/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long num1 = 0L,num2 = 0L;
        LinkedList <Integer> a = new LinkedList();
        LinkedList<Integer> b = new LinkedList();
        while(l1!=null){
            a.push(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
           b.push(l2.val);
            l2 = l2.next;
        }
        while(a.size()!=0){
            num1 = num1*10 + a.pop();
        }
         while(b.size()!=0){
            num2 = num2*10 + b.pop();
        }
        long res = num1+num2;
        
   
        ListNode pre = new ListNode(0);
         ListNode head = pre;
       if(res == 0) pre.next = new ListNode(0);
        while(res>0){
            int tmp =(int) (res%10);
            pre.next = new ListNode(tmp);
            pre = pre.next;
            res =(int)(res/10 );
        }
        return head.next;
        
    }
}