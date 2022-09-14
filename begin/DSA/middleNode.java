class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode prev = head;
        ListNode slow = prev;
        ListNode fast = prev;
        if(prev.next == null){
            return head;
        }
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
          
        }
        return slow;
       
        
        
    }
}