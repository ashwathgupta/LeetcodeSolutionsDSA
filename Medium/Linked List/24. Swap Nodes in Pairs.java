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
    public ListNode swapPairs(ListNode head) {

        if (head == null)
            return null;
        if (head.next == null)
            return head;

        ListNode res = head.next;
        ListNode left = head, right = head.next;

        while (right != null) {
            left.next = right.next;

            right.next = left;

            ListNode bank = left;
            if (left.next != null) {
                left = left.next;
            } else {
                break;
            }
            if (left.next != null) {
                right = left.next;
                bank.next = right;
            } else {
                break;
            }

        }
        return res;

    }
}


// dummy node better approach (expected)
// class Solution {
//     public ListNode swapPairs(ListNode head) {
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;

//         ListNode prev = dummy;

//         while (prev.next != null && prev.next.next != null) {
//             ListNode first = prev.next;
//             ListNode second = first.next;

//             // swap
//             prev.next = second;
//             first.next = second.next;
//             second.next = first;

//             // move prev forward
//             prev = first;
//         }

//         return dummy.next;
//     }
// }