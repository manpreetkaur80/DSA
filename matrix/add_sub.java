import java.util.Scanner;

public class add_sub{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int d[][]=new int[3][3];    
        System.out.println("Enter the elements of the first array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second array");
        for(int k=0 ; k<3 ;k++){
            for(int l=0;l<3;l++){
                b[k][l]=sc.nextInt();
            }
        }
    
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            c[i][j]=a[i][j]+b[i][j];
        }
    }
    System.out.println("The sum of the two arrays is:");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            d[i][j]=a[i][j]-b[i][j];
        }
    }
    System.out.println("The difference of the two arrays is:");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(d[i][j]+" ");
        }
        System.out.println();
    }
    
}
}