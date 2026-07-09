// Last updated: 09/07/2026, 10:03:53
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
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0); // Dummy node for sorted list
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next; // Save next node to process

            // Find position in sorted part
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // Insert curr between prev and prev.next
            curr.next = prev.next;
            prev.next = curr;

            // Move to the next node
            curr = nextNode;
        }

        return dummy.next; // Head of sorted list
    }
}
