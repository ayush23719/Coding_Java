class Solution {
    public ListNode removeElements(ListNode head, int val) {
    
        if(head==null){
            return head;
        }
        
        ListNode current=head;
        ListNode pre=null;
        
        while(current!=null){
            if(current.val==val){
                if(pre==null){
                    current=current.next;
                    head=current;
                }
                else{
                    pre.next=current.next;
                    current.next=null;
                    current=pre.next;
                }
            }
            else{
                pre=current;
                current=current.next;
            }
        }
        
        return head;
    }
    
    }