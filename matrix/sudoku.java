public class sudoku {
    static boolean isvalid(int[][] mat)
    {   
            int[][] rows=new int[10][10];
            int[][] cols=new int[10][10];
            int[][] box=new int[10][10];
            for(int i=0;i<9;i++){
                for(int j=0 ;j<9;j++)
                {
                    int val=mat[i][j];
                    if(val==0)
                    {
                        continue;
                    }
                    if(mat[i][val]==1)
                    {
                        return false;
                    }
                    mat[i][val]=1;
                    if(mat[j][val]==1)
                    {
                        return false;
                    }
                    mat[j][val]=1;
                    int index=(i/3)*3+(j/3);
                    if(box[index][val]==1)
                    {
                        return false;
                    }
                    box[index][val]=1;


                    
                }
            }
            return true;
    }
    public static void main(String[] args) {
        int[][] mat={
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9 , 5 ,  9 ,  9 },
            {
    }
        };
        if(isvalid(mat))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
