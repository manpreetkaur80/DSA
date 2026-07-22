import java.util.*;

public class matrix{
   static void row(int arr[][])
    {
        for(int i=0 ; i<arr.length;i++)
        {
            Arrays.sort(arr[i]);
        }
    }
    static void column(int arr[][])
    {
        
        for(int i=0 ; i<arr.length;i++)
        {
            for(int j=0 ; j<arr.length;j++)
            {
                int temp=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        System.out.println("enter the 2D array0");
        Scanner sc=new Scanner(System.in);
        for(int i=0 ; i<arr.length;i++)
        {
            for(int j=0 ; j<arr.length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }   
        // row(arr);
        column(arr);
        row(arr);
        column(arr);
        for(int i=0 ; i<arr.length;i++)
        {
            for(int j=0 ; j<arr.length;j++)
            {
                
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }   

        

    }
}