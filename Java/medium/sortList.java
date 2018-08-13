/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null||head.next ==null){
            return head;
        }
        ListNode slow = head,fast = head,pre= null;
        while(fast!=null&&fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
       
        pre.next = null;
        return mergeList(sortList(head),sortList(slow));
    }
    
    public ListNode mergeList(ListNode list1, ListNode list2){
        ListNode head= new ListNode(0),newList = head;// 加头结点的方法非常好
        
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
               newList.next =list1;
               newList = newList.next;
               list1 = list1.next;
            }
            else if(list1.val>=list2.val){
                newList .next= list2;
                newList = newList.next;
                list2 = list2.next;
            }
        }
        
        if(list1!=null){
            newList.next =list1;
        }
        else if(list2!=null){
            newList.next =list2;
        }else{
            newList.next = null;
        }
  
        return head.next;
    }
}