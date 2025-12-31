class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int result [] = new int [2];
        int start=0,end=numbers.length-1;
        int len  = numbers.length;
        int sum=-1000000;
    while(sum!=target)
    {
        start=0;
        end=len-1;
        while(start<end)
        {
            
            sum=numbers[start]+numbers[end];
            if(sum<target)
            {
                start++;
            }
            if(sum==target)
            {
                result[1]=end+1;
                result[0]=start+1;
               return result;
            }
            if(sum>target)
            {
                end--;
            }
           

        }
    }
        // for(int i=0;i<len;i++)
        // {
            
        //     for(int j=i+1;j<len;j++)
        //     {
        //         int sum2= numbers[i]+numbers[j];
        //         if(sum2==target)
        //         {
        //              result[0]=i+1;
        //             result[1]=j+1;
        //             return result;
        //         }
        //     }
        // }
        return result;
    }
}
