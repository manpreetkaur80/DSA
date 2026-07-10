import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class row_sort{

    static void  row(int arr[][])
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
        row(arr);
        System.out.println("Sorted array is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}