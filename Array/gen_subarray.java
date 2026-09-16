import java.util.*;
public class gen_subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0 ; i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0 ; i<arr.length;i++)
        {
            for(int j=i; j<arr.length;j++)
            {
                for(int k=i ; k<=j ; k++)
                {
                    System.out.print(""+arr[k]+" ");
                }
                System.out.println();
                }
            
        }
    }
}
