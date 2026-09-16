import java.util.Scanner;
public class insertion_end {
    public static void main(String[] args) {
        int arr[]=  new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of element you want to enter ");
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the number you want to insert at the end of the array:");
        int n = sc.nextInt();
        arr[size]=n;
        System.out.println("the array after insertion is:");
        for(int i=0;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
