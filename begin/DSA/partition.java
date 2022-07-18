class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode l1 = null;
        ListNode l1Head = null;
        ListNode l2 = null;
        ListNode l2Head = null;
        while(head != null) {
            int value = head.val;
            
            if(value < x) {

                if(l1 == null) {
                    l1 = new ListNode(value, null);
                    l1Head = l1;
                } else {
                    l1.next = new ListNode(value, null);
                    l1 = l1.next; 
                }
            } else {

                if(l2 == null) {
                    l2 = new ListNode(value, null);
                    l2Head = l2;
                } else {
                    l2.next = new ListNode(value, null);
                    l2 = l2.next;
                }
            }
            head = head.next;
        }
        
        if(l1 != null && l2Head != null) {
            l1.next = l2Head;
        } else if(l1 == null && l2Head != null) {
            return l2Head;
        }
            
        
        return l1Head;
    }
}