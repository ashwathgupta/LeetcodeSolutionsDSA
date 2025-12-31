class Solution {
    public int singleNumber(int[] nums) {

        int i=0;
        int len = nums.length;
        Arrays.sort(nums);
        if(len==1)
        {
            return nums[0];
        }
        for(i=0;i<len;i++)
        {
            if(i>0 && i<len-1)
            {
                if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1])
                {
                return nums[i];
                }

            }
            else if (i==0)
            {
                if(nums[i]!=nums[i+1])
                {
                return nums[i];
                }
            }
            else if (i==len-1)
            {
                if(nums[i]!=nums[i-1])
                {
                    return nums[i];
                }
            }

        }

        return nums[len-1];


    }
}
