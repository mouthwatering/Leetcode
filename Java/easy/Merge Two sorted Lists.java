/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergedList = new ListNode(0);
        ListNode curP= mergedList;
        while(l1!=null||l2!=null){
            if(l1!=null&&l2!=null&&l1.val<l2.val){
                curP.next = l1;
                l1 = l1.next;
            }else if(l1!=null&&l2!=null&&l1.val>=l2.val){
                curP.next=l2;
                l2 =l2.next;
            }else if(l1==null){
                curP.next=l2;
                l2 =l2.next;
            }else{
                curP.next = l1;
                l1 = l1.next;
            }
            curP = curP.next;
        }
        curP.next = null;
        return mergedList.next;
    }
}