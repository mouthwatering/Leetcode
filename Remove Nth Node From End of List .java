/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode beforeP= new ListNode(0);//��һ��ǰ�ý�㣬���������׽ڵ㱻ȥ�������
        beforeP.next = head;
        ListNode curP=beforeP,preP=beforeP,firstP=beforeP;
        while(n-1>=0){
            firstP = firstP.next;
            n--;
        }
        while(firstP!=null){
            preP = curP;
            curP = curP.next;
            firstP = firstP.next;
        }
        preP.next=curP.next;
        return beforeP.next;
    }
}