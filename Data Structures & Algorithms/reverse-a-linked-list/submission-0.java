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
        // Input: {0, 1} -> {1, 2} -> {2, 3} -> {3, null} -> null
        // Output: {3, 2} -> {2, 1} -> {1, 0} -> {0, null} -> null
        // cur = {0, 1}
        ListNode last = null;
        ListNode cur = head;
        ListNode next;

        while(cur != null){
            next = cur.next;
            cur.next = last;
            last = cur;
            cur = next;
        }
        
        return last;
    }
}
