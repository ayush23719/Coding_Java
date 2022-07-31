class Solution {
    public ListNode reverseList(ListNode head) {
      if (head == null) {
          return null;
      } else {
          ListNode cur = null;
          while (head != null) {
              cur = new ListNode(head.val, cur);
              head = head.next;
          }
          return cur;
      }
  }
} 