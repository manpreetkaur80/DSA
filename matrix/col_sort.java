import java.util.Arrays;
import java.util.Scanner;
public class col_sort {
    static void transpose(int arr[][])
    {
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr[0].length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void row(int arr[][])
         {
            for(int i=0 ; i<arr.length;i++)
            {
                Arrays.sort(arr[i]);
            }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int arr[][]=new int[3][3];
            System.out.println("Enter the elements of the array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr);
        row(arr);
        transpose(arr);
        System.out.println("Sorted array is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
