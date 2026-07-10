import java.util.Scanner;
// right rotationnn
public class rotate {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<arr.length ;i++)
        {
            arr[i]=sc.nextInt();
        }
        int d=2;
        for(int i=0 ; i<d;i++)
        {
            // arr[arr.length-1]=arr[0];

            int last=arr[arr.length-1];
            for(int j=arr.length-1 ; j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            
            arr[0]=last;
        }
        for(int i=0 ; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
