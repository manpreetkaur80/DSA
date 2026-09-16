import java.util.Scanner;

public class elementToIndex {
    public static void main(String args[]) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j=0 ; j<arr.length;j++)
            {
                if(arr[j]==i)
                {
                    int temp= arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    break;
                }
            }
           
        }
        for(int i=0 ; i<arr.length;i++)
        {
            if(arr[i]!=i)
            {
                arr[i]=-1;
            }
        }
         for(int i=0 ; i<arr.length;i++)
         {
            System.out.println(arr[i]);
         }
    }
}
