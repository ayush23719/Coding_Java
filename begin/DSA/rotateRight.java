class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null) return null;
        ListNode right = head;
        ListNode left = head;
        ListNode forSize = head;
        int count = 0;
        
        while(forSize != null){
            forSize = forSize.next;
            count++;
        }
        k = k % count;
        
        for(int i = 0; i < k; i++){
            if(right == null) return head;
            right = right.next;
        }     
        while(right.next != null){
            right = right.next;
            left = left.next;          
        }
        right.next = head;
        head = left.next;
        left.next = null;        
        return head;
    }
}