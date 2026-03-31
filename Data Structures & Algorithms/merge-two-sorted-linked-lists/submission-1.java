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
        // create a new list to append the lowest to
        // loop until one is null
        // in the loop append the lowest of the current lists to the new list
        // after the loop check if one is null and append the other to the new list
        // return newlist.next
        // Output: {1, 1} -> {1, 2} -> {2, 3} -> {3, 4} -> {4, 5} -> {5, null} -> null

        ListNode head = new ListNode();
        ListNode tail = head;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        if(list1 == null){
            tail.next = list2;
        }

        if(list2 == null){
            tail.next = list1;
        }

        return head.next;
    }
}