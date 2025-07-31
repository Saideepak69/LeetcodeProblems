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
        Stack<Integer> stk = new Stack<>();
        ListNode curr = head;
        while(curr!=null){
            stk.add(curr.val);
            curr=curr.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(!stk.isEmpty()){
            temp.next = new ListNode(stk.peek());
            stk.pop();
            temp=temp.next;
        }
        return dummy.next;
    }
}