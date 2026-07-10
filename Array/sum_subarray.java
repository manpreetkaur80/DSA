import java.util.*;
public class sum_subarray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        int sum=0;
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
                    
                    sum+=arr[k];
                    System.out.print(""+arr[k]+" ");
                }
                System.out.println();
                }
            
        }
        System.out.print("sum : "+sum);
    }}


