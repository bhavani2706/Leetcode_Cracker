// Last updated: 09/07/2026, 10:03:31
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode rev=head;
        while(rev!=null)
        {
            ListNode x=rev.next;
            rev.next=prev;
            prev =rev;
            rev=x;
        } 
          return prev;

        
    }
}