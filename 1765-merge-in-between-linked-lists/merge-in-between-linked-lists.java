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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode temp = list1;
        int i=0;
        while(i < a && temp!=null){
            curr.next = new ListNode(temp.val);
            curr = curr.next;
            temp = temp.next;
            i++;
        }
        while(i < b+1){
            temp = temp.next;
            i++;
        }
        curr.next = list2;
        ListNode s = list2;
        while(s.next!=null){
            s=s.next;
        }
        s.next = temp;
        return dummy.next;
    }
}