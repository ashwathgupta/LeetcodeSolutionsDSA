class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

        int l1=queries.length , l2=nums.length;
        int arr[] = new int [l1];
        int sum=0,j=0;
        Queue <Integer> que = new LinkedList<>();

        for(int i=0;i<l1;i++)
        {   
            sum=0;
            nums[queries[i][1]] += queries[i][0];
            for(j=0;j<l2;j++)
            {
            
                if(nums[j]%2==0)
                {
                    sum+=nums[j];
                }

            }
            que.add(sum);
            
            
        }
        j=0;
        while(!que.isEmpty())
        {
            arr[j]=que.remove();
            j++;
        }
        
        return arr;
    }
}
