import java.util.Arrays;
import java.util.Scanner;    
public class strict_sort {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int copy[]=new int[9];
        int k=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                copy[k]=arr[i][j];
                k++;
            }
        }
        Arrays.sort(copy);
        k=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=copy[k];
                k++;
            }
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        

    }
}
