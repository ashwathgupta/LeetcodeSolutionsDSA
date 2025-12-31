class Solution {
    public void gameOfLife(int[][] board) {
        int row= board.length;
        int col= board[0].length;
        int newboard[][]= new int[row][col];
        int i,j;    

        if(row==1 && col==1)
        {
            board[0][0]=0;
            return ;
        }
        
        else if(row==1 && col>1)
        {
            newboard[0][0]=0;
            for(i=1;i<col-1;i++)
            {
                if(board[0][i-1]==1 && board[0][i+1]==1 )
                {   if(board[0][i]==1)
                        newboard[0][i]=1;
                    else 
                        newboard[0][i]=0;
                }
                else 
                    newboard[0][i]=0;
            }
            newboard[0][col-1]=0;
             for(i=0;i<col;i++)
            {
                board[0][i] = newboard[0][i];
            }
            return ;
        }
        else if(row>1 && col==1)
        {
            newboard[0][0]=0;
            for(i=1;i<row-1;i++)
            {
                if(board[i-1][0]==1 && board[i+1][0]==1 )
                {
                    if(board[i][0]==1)
                        newboard[i][0]=1;
                    else
                        newboard[i][0]=0;
                }
                else 
                    newboard[i][0]=0;
            }
            newboard[row-1][0]=0;
             for(i=0;i<row;i++)
            {
                board[i][0] = newboard[i][0];
            }
            return ;
        }
       
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                int live=0;
                if(i==0 && j==0)
                {
                    
                    if(board[i+1][j]==1) live++;
                    if(board[i][j+1]==1) live++;
                    if(board[i+1][j+1]==1) live++;

                   
                }
                else if(i==row-1 && j== col-1)
                {
                   //if(board[i+1][j]==1) live++;
                    //if(board[i][j+1]==1) live++;
                    //if(board[i+1][j+1]==1) live++;
                    if(board[i][j-1]==1) live++;
                    //if(board[i+1][j-1]==1) live++;
                    if(board[i-1][j-1]==1) live++;
                    if(board[i-1][j]==1) live++;
                }
                else if(i==0 && j<col-1)
                {
                   
                    if(board[i+1][j]==1) live++;
                    if(board[i][j+1]==1) live++;
                    if(board[i+1][j+1]==1) live++;
                    if(board[i][j-1]==1) live++;
                    if(board[i+1][j-1]==1) live++;

                }

                else if(j==0 &&  i<row-1)
                {
                    
                    if(board[i+1][j]==1) live++;
                    if(board[i][j+1]==1) live++;
                    if(board[i+1][j+1]==1) live++;
                    //if(board[i][j-1]==1) live++;
                    //if(board[i+1][j-1]==1) live++;
                    if(board[i-1][j+1]==1) live++;
                    if(board[i-1][j]==1) live++;
  
                }
                
                else if(i==row-1 && j>0 && j<col-1)
                {
                    if(board[i-1][j]==1) live++;
                    if(board[i][j+1]==1) live++;
                    if(board[i-1][j+1]==1) live++;
                    if(board[i][j-1]==1) live++;
                    if(board[i-1][j-1]==1) live++;
                }
                else if(j==col-1 && i<row-1 && i>0) 
                {
                    if(board[i+1][j]==1) live++;
                    if(board[i][j-1]==1) live++;
                    if(board[i+1][j-1]==1) live++;
                    //if(board[i][j-1]==1) live++;
                    //if(board[i+1][j-1]==1) live++;
                    if(board[i-1][j-1]==1) live++;
                    if(board[i-1][j]==1) live++;

                }
                else if(i==0 && j==col-1)
                {
                    if(board[i+1][j]==1) live++;
                    if(board[i][j-1]==1) live++;
                    if(board[i+1][j-1]==1) live++;

                   
                    // if(board[i-1][j-1]==1) live++;
                    // if(board[i-1][j]==1) live++;
                }
                 else if(i==row-1 && j==0)
                {
                    if(board[i-1][j]==1) live++;
                    // if(board[i][j-1]==1) live++;
                    // if(board[i+1][j-1]==1) live++;
                    if(board[i][j+1]==1) live++;
                    if(board[i-1][j+1]==1) live++;
                    // if(board[i-1][j-1]==1) live++;
                    // if(board[i-1][j]==1) live++;
                }
                else if(i>0 && i<row-1 && j>0 && j<col-1)
                {
                    if(board[i+1][j]==1) live++;
                    if(board[i][j+1]==1) live++;
                    if(board[i+1][j-1]==1) live++;
                    if(board[i][j-1]==1) live++;
                    if(board[i+1][j+1]==1) live++;
                    if(board[i-1][j-1]==1) live++;
                    if(board[i-1][j]==1) live++;
                    if(board[i-1][j+1]==1) live++;

                }

                if(board[i][j]==0)
                {
                    if(live==3) newboard[i][j]=1;   
                }
                else if(board[i][j]==1)
                {
                    if(live<2) newboard[i][j]=0;
                    else if(live==2 || live ==3) newboard[i][j]=1;
                    else if(live>3)newboard[i][j]=0;
                }

            }
        }

        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                board[i][j]=newboard[i][j];
            }
        }
        
    }
}