class Solution {
    public int jump(int[] nums) {
        
        int jumps=0,len=nums.length;
        int i=0,j=0,distance=0;
        int maxjumps=0,max=0,count=0,maxIndex=0;
        if(len==1)
        {
            return 0;
        }
        while(i<=len-1)
        {
            maxjumps=nums[i];
            if(i+maxjumps>=len-1)
            {
                i=i+maxjumps;
                jumps++;
                return jumps;
            }
            j=i+maxjumps;
            int k=i;
            while(j>=k)
            {
                int jj=nums[j];
                int jk=nums[k];
                int j1= j+jj;
                int j2= k+jk;
                if(j+jj>jk+k)
                {
                    if(j+jj>max)
                    {
                        i=j;
                        max=j1;
                    }
                }
                else{
                   if(jk+k>max)
                   {
                        i=k;
                        max=j2;
                   }
                }
                j--;
                k++;
            }
            jumps++;
          
        }
        return jumps;
    }
}
