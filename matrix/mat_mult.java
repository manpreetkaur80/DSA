import java.util.Scanner;
public class mat_mult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][2];
        int b[][]=new int[2][3];
        int c[][]=new int[3][3];
        System.out.println("Enter the elements of the first array");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second array");
        for(int k=0 ; k<2 ;k++){
            for(int l=0;l<3;l++){
                b[k][l]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0 ; j<3 ;j++)
            {
                c[i][j]=0;
                for(int k=0 ;k<3;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }

            }
        }
        System.out.println("The product of the two matrices is:");
        for(int i=0;i<3;i++){
            for(int j=0 ; j<3 ;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


    }
}
