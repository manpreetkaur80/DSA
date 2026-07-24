public class conway_mat {
    public static void main(String[] args) {
        int[][] board = {
            {0,1,0},
            {0,0,1},
            {1,1,1},
            {0,0,0}
        };
        int copy[][]=new int[board.length][board[0].length];
        for(int i=0 ; i<board.length;i++)
        {
            for(int j=0 ; j<board[i].length;j++)
            {
                copy[i][j]=board[i][j];
            }
        }
        for(int i=0 ; i<board.length ;i++)
        {
            for(int j=0 ; j<board[0].length;j++)
            {
                if(board[i][j]==1)
                {
                    if(checklive(copy,i,j)==2 || checklive(copy,i,j)==3)
                    {
                        board[i][j]=1;
                    }
                    else
                    {
                        board[i][j]=0;
                    }
                }
                else
                {
                    if(checklive(copy, i , j)==3)


                        
                    {
                        board[i][j]=1;
                    }
                    else{
                        board[i][j]=0;
                    }
                }
            }
        }
        for(int i=0 ; i<board.length;i++)
        {
            for(int j=0 ; j<board[0].length;j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }   
    static int checklive(int [][] copy , int i  , int j)
    {   int live=0;
         if(j+1<copy[0].length && copy[i][j+1]==1){live++;}   // right cell
        if(j-1>=0 && copy[i][j-1]==1){live++;}            // left cell
        if(i+1<copy.length && copy[i+1][j]==1){live++;}   // down cell
        if(i-1>=0 && copy[i-1][j]==1){live++;}            // up cell
        if(i-1>=0 && j-1>=0 && copy[i-1][j-1]==1){live++;}          // up left cell
        if(i-1>=0 && j+1<copy[0].length && copy[i-1][j+1]==1){live++;}   // up right cell
        if(i+1<copy.length && j-1>=0 && copy[i+1][j-1]==1){live++;}          // down left cell
        if(i+1<copy.length && j+1<copy[0].length && copy[i+1][j+1]==1){live++;}   // down right cell
        return live;
    }
}
