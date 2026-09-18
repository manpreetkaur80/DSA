import java.util.*;
public class matrix_basics {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Matrix elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix elements are:");
        for(int i=0 ;i<3;i++)
        {
            for(int j=0 ;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("enter the element you want to search");
        int x=sc.nextInt();
        for(int i=0 ;i<3 ;i++)
        {
            for(int j=0 ;j<3;j++)
            {
                if(arr[i][j]==x)
                {
                    System.out.println("the element is found at index "+i+" "+j);
                }
            }
        }
    }
}
