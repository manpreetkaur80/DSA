    import java.util.*;
public class max_sum_sbarr {
    public static void main(String[] args) {
        int arr[]=new int[4];
        int sum=0;
       int minsum = Integer.MAX_VALUE;
int maxsum = Integer.MIN_VALUE;

        int total=0;
    
        Scanner sc=new Scanner(System.in);
        for(int i=0 ; i<arr.length ;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0 ; i<arr.length;i++)
        {
            total+=arr[i];
            sum=0;
            for(int j=i ; j<arr.length ;j++)
            {
               
                        sum+=arr[j];
                       maxsum=Math.max(maxsum , sum);
                       minsum=Math.min(minsum, sum);
                    }
        }
        int cir_sum=total-minsum;
        System.out.println(total+ 
            " : total"
        );
        System.out.println("max : "+maxsum+"  min : "+minsum);
        System.out.println("max subarray sum" +Math.max(maxsum,cir_sum));;
    }
}
