public class rotate_180 {
    public static void main(String[] args) {
        int[][] board={{1,2,3},{4,5,6},{7,8,9}};
        int[][] copy=new int[board.length][board[0].length];
        int n=board.length;
        int m=board[0].length;
        for(int i=0 ; i< board.length;i++)
        {
            for(int j=0 ; j< board[0].length;j++ )
            {
                copy[m-i-1][m-j-1]=board[i][j]    ;  // 180rotate
            }

            System.out.println();
    }
        for(int i=0 ; i< board.length;i++)
        {
            for(int j=0 ; j< board[0].length;j++ )
            {
                System.out.print(copy[i][j]+" ");
             }
             System.out.println();
}
}
}
