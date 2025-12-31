/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        ListNode f1=headA,f2=headB;
        int c1=0, c2=0;
        if(f1==f2) return f1;

        if(headA.next==headB.next)
        {
                if(headA.next==null) return null;
                else {
            return headA;
                }
               
        }
        while(headB.next!=null)
        {
          
            headB=headB.next;
            
             c2++;
        }
        while( headA.next!=null)
        {
            headA=headA.next;
             c1++;
        }
        headA=f1; headB=f2;

        
        if(c1>c2)
        {       
            while(c1!=c2)
            {
                headA=headA.next;
                c1--;
            }
        }
        else if(c2>c1){
            while(c2!=c1)
            {
                headB=headB.next;
                c2--;
            }
        }
        while(headA!=headB)
        {
            headA=headA.next;
            headB=headB.next;
        }
       
        return headA;  
     

        


    }
}
