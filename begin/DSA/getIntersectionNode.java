public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    
        int lengthA = 0;
        int lengthB = 0;
        
        for(ListNode temp = headA; temp != null; temp = temp.next) {
            
            lengthA++;
        }
        
        for(ListNode temp = headB; temp != null; temp = temp.next) {
            
            lengthB++;
        }
        
        if(lengthA < lengthB) {
            return getIntersectionNode(headB, headA);
        }
        
        int steps = lengthA - lengthB;
        
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        
        for(int i = 0; i < steps; i++) {
            
            temp1 = temp1.next;
        }
        
        while(temp1 != null) {
            
            if(temp1 == temp2) return temp1;
            
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return null;
    }
    
    }