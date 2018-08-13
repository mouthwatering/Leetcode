/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB ==null){
            return null;
        }
        int lengthA =0,lengthB = 0;
        ListNode pA = headA;
        ListNode pB = headB;
        while(pA!=null){
            pA= pA.next;
            lengthA++;
        }
        while(pB!=null){
            pB = pB.next;
            lengthB++;
        }
        int i=lengthA-lengthB;
        pA = headA;
        pB = headB;
        if(lengthA < lengthB) 
            return getIntersectionNode(headB, headA);
        while(i-- > 0) pA = pA.next;
        while(pA!=null){
            if(pA==pB){
                    return pA;
            }
            pA = pA.next;
            pB = pB.next;// ������ΪһЩС������ʱ�䣬���ɣ���������ѭ���˰ɣ���ô���°���
        }
        return null;
    }
}