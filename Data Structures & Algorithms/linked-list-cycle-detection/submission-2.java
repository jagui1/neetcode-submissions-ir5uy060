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
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head.next;
        
        while(p1.next != null && p2.next != null && p2.next.next != null) {
            if(p1.equals(p2)) return true;

            p1 = p1.next;
            p2 = p2.next.next;
        }

        return false;
    }
}
