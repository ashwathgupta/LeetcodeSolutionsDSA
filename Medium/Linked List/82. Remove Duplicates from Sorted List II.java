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
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode curr = head.next, prev = head;

        while (curr != null) {
            if (prev.val == curr.val) {
                while (curr != null && curr.val == prev.val) {
                    curr = curr.next;
                }
                ListNode head2 = head;
                if (head2 == prev) {
                    head = curr;
                } else {
                    while (head2.next != prev) {
                        head2 = head2.next;

                    }
                }
                prev = head2;
                head2.next = curr;
                if (curr == null) {
                    return head;
                }

            }
            curr = curr.next;
            prev = prev.next;
        }

        return head;

    }
}


// AI optimized solution
// Your original approach demonstrates good pointer manipulation. The main improvement is learning to use a dummy node and maintaining a pointer to the previous valid node instead of repeatedly searching for it.


// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {

//         ListNode dummy = new ListNode(-1);
//         dummy.next = head;

//         ListNode prev = dummy;
//         ListNode curr = head;

//         while (curr != null) {

//             if (curr.next != null && curr.val == curr.next.val) {

//                 int duplicate = curr.val;

//                 while (curr != null && curr.val == duplicate) {
//                     curr = curr.next;
//                 }

//                 prev.next = curr;

//             } else {

//                 prev = curr;
//                 curr = curr.next;

//             }
//         }

//         return dummy.next;
//     }
// }