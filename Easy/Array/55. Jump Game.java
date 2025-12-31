class Solution {
    public boolean canJump(int[] nums) {
      
        int i=0,j=0, jump , len, maxJump=0, maxJumpKey=0 ,flag=0;
        int max2=0,maxJump2=0,maxJumpKey2=0;
        len = nums.length;
        if(len==1)
        {   
            return true;
        }
        
        while(i<len-1)
        {
             
           if(nums[i]+i>max2)
            {
                maxJump2=nums[i];
                maxJumpKey2=i;
                max2=maxJumpKey2+maxJump2;
                if(max2>=len-1)
                {
                    return true;
                }
                
            }
            //  if(nums[i]+i>=  len-1 )
            // {
            //     return true;
            // }
            
            if(nums[i]==0 && i<=len-1 )
            {   
                if(nums[i]+i==max2)
                {
                    return false;
                }
                if(i!=0)
                {
                    int p= max2;
                    int q=maxJumpKey;
                    int r = maxJump2;
                    while(p>i)
                    {
                       if(nums[p]+p > max2 )
                       {
                            if(nums[p]+p >=len-1)
                            {
                                return true;
                            }
                            j=p-1;
                       
                       }
                       p--;
                    }
                    if(j>i)
                    {
                        i=j-1;
                    }
                    if(p==0)
                    {
                        return false;
                    }
                }
                else{
                    
                    return false;
                }
            }
        
          i++;     
        }
        return false;
    }
}
