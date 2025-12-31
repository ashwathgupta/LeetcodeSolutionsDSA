class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
            int l1=matrix.length;
            int l2= matrix[0].length;
            int index=0,i;
            int flag=0 ,flag1=0,flag2=0;
           
            if(target>matrix[l1-1][l2-1])
            {
                return false;
            }
            if(l1==1)
            {
                flag1=1;
                for( i=0;i<l2;i++)
                {
                    if(matrix[0][i]==target)
                    {
                        return true;
                    }
                }
            }

            if(flag1==1)
            {
                return false;
            }
            if(l2==1)
            {
                flag2=1;
                for(i=0;i<l1;i++)
                {

                    if(matrix[i][0]==target)
                    {
                        return true;
                    }
                    
                }
            }
            if(flag2==1)
            {
                return false;
            }


            for( i=0;i<l1;i++)
            {
                if(matrix[i][0]>target)
                {
                    index=i-1;
                    flag=1;
                    break;
                }
                if(matrix[i][0]==target)
                {
                    return true;
                }
               
            }
            if(flag==0)
            {
                if(i<l1) index=i;
                else index=l1-1;
                
            }
             if(index<0)
            {
                index=0;
            }
            if(i==l1-1)
            {
                if(matrix[i][0]<target)
                {
                    for(int travel = 0 ;travel<l2;travel++)
                    {
                        if(matrix[i][travel]==target)
                        {
                            return true;
                        }
                        if(matrix[i][travel]>target)
                        {
                            return false;
                        }
                    }
                }
            }

            
            for( i=0;i<l2;i++)
            {
                if(matrix[index][i]==target)
                {
                    return true;
                }
            }
            return false;

    }
}