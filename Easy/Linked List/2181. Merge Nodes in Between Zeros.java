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
    public ListNode mergeNodes(ListNode head) {
         
        if(head==null) return null;
        if(head.next==null) return head;
         
        while(head.next.val==0)
        {
           
            head=head.next;
            
        }
        ListNode res= new ListNode(head.val);
       
        ListNode l=res;
        while(head.next!=null)
        {
            int sum=0;
            if(head.val==0)
            {
                if(head.next!=null) head=head.next;
               
               while(head.next!=null && head.next.val!=0)
               {
                    sum+=head.val;
                    head=head.next;
               }
               sum+=head.val;
               l.next=new ListNode(sum);
               
               l=l.next;
            }
            head=head.next;

        }
        return res.next;



    }
}
