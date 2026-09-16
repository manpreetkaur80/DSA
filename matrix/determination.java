import java.util.Scanner;

public class determination {
    public static int findDeterminant(int[][] matrix, int n) {
        if(n==1)
        {
            return matrix[0][0];
        }
       if(n==2)
       {
        int determinant=matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
       
        return determinant;
       }
        int determinant = 0;
        int sign = 1;

       
        for (int col = 0; col < n; col++) {
           
            int[][] minor = new int[n - 1][n - 1];
            for (int i = 1; i < n; i++) {
                int minorCol = 0;
                for (int j = 0; j < n; j++) {
                    if (j == col) continue;
                    minor[i - 1][minorCol] = matrix[i][j];
                    minorCol++;
                }
            }

            // Recursive call
            determinant += sign * matrix[0][col] * findDeterminant(minor, n - 1);

            // Alternate sign
            sign = -sign;
        }

        return determinant;

    }
    public static void main(String[] args) {
        int[][] board=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size n:");
        int n=sc.nextInt();
       
        System.out.println("Enter the elements of the board:");
        for(int i=0 ; i< n;i++)
        {
            for(int j=0 ; j< n;j++ )
            {
                board[i][j]=sc.nextInt();
            }
        }
        System.out.println("The board is:");
        for(int i=0 ; i< n;i++)
        {
            for(int j=0 ; j< n;j++ )
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
         }

        System.out.println(findDeterminant(board, n)); 
    }
}