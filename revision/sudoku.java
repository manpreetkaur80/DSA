public class sudoku {
    
    static boolean isValid(int[][] mat){

        int rows[][]=new int[10][10];
        int cols[][]=new int[10][10];
        int submat[][]=new int[10][10];
        for(int i=0 ; i  <9;i++)
        {
            for(int j=0 ; j<9 ;j++)
            {
                int val=mat[i][j];
                if(mat[i][j]==0)
                {
                    continue;
                }
                if(rows[i][val]==1)
                {
                    return false;
                }
                rows[i][val]=1;
                if(cols[val][j]==1)
                {
                    return false;
                }
                cols[val][j]=1;
                int index=(i/3)*3+(j/3);
                    if(submat[index][val]==1)
                    {
                        return false;
                    }
                    submat[index][val]=1;

            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int[][] mat = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                        { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                        { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                        { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                        { 7, 0, 0, 8, 0, 3, 0, 0, 1 },
                        { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                        { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                        { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                        { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

        System.out.println(isValid(mat) ? "true" : "false");
    }

}
