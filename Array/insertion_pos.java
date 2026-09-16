import java.util.Scanner;
public class insertion_pos {
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
        System.out.println("Enter the number you want to insert at any position of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the position where you want to insert the number:");
        int pos = sc.nextInt();
        for(int i=size-1;i>=pos-1;i--){
            
            arr[i+1]=arr[i];

        }
        arr[pos-1]=n;
        System.out.println("the array after insertion is:");
        for(int i=0;i<=size;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
