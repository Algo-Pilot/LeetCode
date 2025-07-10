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
        // Create a dummy node to simplify handling the head of the merged list.
        ListNode dummy = new ListNode(0);
        ListNode current = dummy; // Pointer to build the merged list

        // Iterate while both lists have nodes
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next; // Move current pointer forward
        }

        // After one list is exhausted, append the remaining nodes of the other list
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        // The merged list starts from dummy.next
        return dummy.next;
    }
}