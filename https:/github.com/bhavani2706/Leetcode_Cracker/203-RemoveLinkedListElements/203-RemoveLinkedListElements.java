// Last updated: 09/07/2026, 09:49:36
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode nn=new ListNode(0);
        nn.next=head;
        ListNode current=nn;
        while(current.next!=null){
            if(current.next.val==val){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return nn.next;
    }
}