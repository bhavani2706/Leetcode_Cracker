// Last updated: 09/07/2026, 10:04:56
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode answer=new ListNode(1);
        ListNode temp=answer;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=new ListNode(list1.val);
                list1=list1.next; }
            else{ temp.next=new ListNode(list2.val);
            list2=list2.next;
        }
         temp=temp.next;
    }if(list1!=null) temp.next=list1;
    else temp.next=list2;
     return answer.next;
}
}
        
    