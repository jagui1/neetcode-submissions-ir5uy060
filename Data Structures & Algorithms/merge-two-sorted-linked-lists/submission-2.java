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
        // Input: {1, 2} -> {2, 4} -> {4, null} -> null
        //        {1, 3} -> {3, 5} -> {5, null} -> null
        // Output: {1, 1} -> {1, 2} -> {2, 3} -> {3, 4} -> {4, 5} -> {5, null} -> null

        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}