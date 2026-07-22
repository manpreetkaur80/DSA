public class matrixSum {
    public static void main(String[] args) {
        int A[][]={{1,2,3},{1,2,3}};
        int B[][]={{2,3,4},{5,4,6}};
        int C[][]=new int[3][3];
        for(int i=0 ;i<A.length;i++)
        {
            for(int j=0 ; j<B.length;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for(int i=0 ; i<C.length;i++)
        {
            for(int j=0 ; j<C.length;j++)
            {
                System.out.print(C[i][j]);
            }
            System.out.println();
        }
    }    
}
