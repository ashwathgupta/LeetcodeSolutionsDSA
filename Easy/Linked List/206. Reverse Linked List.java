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

    public ListNode f1(ListNode head, ListNode prev) {

        if (head.next == null) {
            head.next = prev;
            return head;
        }

        ListNode res = f1(head.next, head);

        head.next = prev;

        return res;

    }

    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        return f1(head, null);
    }
}

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode current = head;
//         ListNode next = null;

//         while (current != null) {
//             next = current.next;  // Store the next node
//             current.next = prev;  // Reverse the current node's pointer
//             prev = current;       // Move prev to this node
//             current = next;       // Move to the next node
//         }

//         return prev;  // Prev will be the new head of the reversed list
//     }
// }
