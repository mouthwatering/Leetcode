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