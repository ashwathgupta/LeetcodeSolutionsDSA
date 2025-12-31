/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head==null)
        {   
            return null;
        }
        Node o1 = new Node(head.val);
        
        Node h1 = head;
        Node h2 = o1;
        while (h1 != null) 
        {
            h1 = h1.next;
            if (h1 != null) 
            {
                o1.next = new Node(h1.val);
               
            } else {
                o1.next = null;
            }
            o1 = o1.next;

        }
        h1 = head;
        o1 = h2;
        Node o2 = h2;
        Node o3 = h2;
        Node o4 = h2;
        Node o5 = head;
        
        while(h1!=null)
        {
            int value= h1.val;
            int count1 = 0,count2=0;
            if(h1.random!=null)
            {
                    while(h1.random!=o5)
                    {
                        o5=o5.next;
                        count1++;
                    }
                   while(count1!=count2)
                   {
                        count2++;
                        o3=o3.next;
                   }
                   o1.random=o3;
                   o3=h2;
                   o5=head;
                   count1=0;
                   count2=0; 
            }
            else
            {
                o1.random=null;

            }
            h1=h1.next;
            o1=o1.next;

        }





        return h2;

    }
}
