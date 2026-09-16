import java.util.*;
public class traversal_recursion {
    public static void main(String[] args) {
        int[][] board=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0 ; i< board.length;i++)
        {
            for(int j=0 ; j< board[0].length;j++ )
            {
                board[i][j]=sc.nextInt();
            }
                } 
                
           
            traversal( board, 0 , 0);

    
    
}
    public static void traversal(int element[][], int i, int j) 
    {
       if(i==element.length && j==element[0].length)
       {
        System.out.print(element[i][j]+" ");
        return;
       }
       else
       {
        System.out.print(element[i][j]+" ");
       }
       if(j+1<element[0].length)
       {
        traversal(element, i, j+1);
       }
       else if(i+1<element.length)
       {
        traversal(element, i+1, 0);
       }
}
}