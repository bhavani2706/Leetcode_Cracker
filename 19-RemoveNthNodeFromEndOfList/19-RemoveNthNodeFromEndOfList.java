// Last updated: 09/07/2026, 10:04:59
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
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int val;
        ListNode next;
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode first=temp;
        ListNode second=temp;
        for(int i=0;i<=n;i++){
            first=first.next;

        }
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        second.next = second.next.next;
        return temp.next;
    }
}