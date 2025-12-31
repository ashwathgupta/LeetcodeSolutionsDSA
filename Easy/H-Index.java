class Solution {
    public int hIndex(int[] citations) {
        
        int len = citations.length;
        int i,j,c=0;
        int h=0,max=citations[0],count=0;
        if(len==1)
        {
            if(citations[0]==0)
            {
                return 0;
            }
            else{
                return 1;
            }
           
        }
        Stack <Integer> stack = new Stack<Integer>();
        for(i=0;i<len;i++)
        {
            int k=citations[i];
            if( k ==0 ){continue;}
            c=0;
            for(j=0;j<len;j++)
            {
                
                if(citations[j]>=k && c<k)
                {
                   
                    c++;
                    
                }
            }
            stack.push(c);
        } 
        if(stack.isEmpty())
        {
            return 0;
        }
        max=stack.peek();
        while(!stack.isEmpty())
        {
            int val= stack.pop();
            if(max<val)
            {
                max=val;
            }
        }
        return max;


    }
}
