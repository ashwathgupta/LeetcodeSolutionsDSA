class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();

        int rows = matrix.length;
        int cols= matrix[0].length;
        int total= rows*cols;
        int count=0;
        int i=0,j=0;
        String direction= "right";
        if(rows ==1 && cols ==1)
        {
            list.add(matrix[0][0]);
            return list;
        }
        if(rows ==1 && cols !=1)
        {
            for(i=0;i<cols;i++)
            {
                list.add(matrix[0][i]);
            }
            
            return list;
        }
        if(rows !=1 && cols ==1)
        {
            for(i=0;i<rows;i++)
            {
                list.add(matrix[i][0]);
            }
            
            return list;
        }
        while(count<total)
        {    
            while(matrix[i][j]!=-219) 
            {

                if(direction =="right")
                {
                    
                    list.add(matrix[i][j]);
                    matrix[i][j]=-219;
                    j++;
                    count++;
                    if(j==cols-1) break;
                }
                if(direction =="down")
                {

                    list.add(matrix[i][j]);
                    matrix[i][j]=-219;
                    i++;count++;
                    if(i==rows-1) break;
                }
                if(direction =="left")
                {
                    list.add(matrix[i][j]);
                    matrix[i][j]=-219;
                    j--;
                    count++;
                    if(j==0) break;
                }
                if(direction =="up")
                {
                    
                    list.add(matrix[i][j]);
                    matrix[i][j]=-219;
                    i--;
                    count++;
                    if(i==0) break;
                }  
            } 

            if(direction =="right")
            {
                if(matrix[i][j]==-219)
                    {
                        j--;
                        i++;   
                    }
                direction = "down";       
            }
            else if (direction =="down" ){
                if(matrix[i][j]==-219)
                    {
                        i--;
                        j--;   
                    }
               direction="left";
            }

            else if(direction=="left")
            {
                 if(matrix[i][j]==-219)
                    {
                        j++;
                        i--;   
                    }
                direction = "up";
            }
            else if(direction =="up")
            {
                if(matrix[i][j]==-219)
                    {
                        i++;
                        j++;   
                    }
                direction = "right";
            }
           
        }     

        return list;

    }
}
