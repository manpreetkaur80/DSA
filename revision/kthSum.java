import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class kthSum {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int sum;
        int k=1;
        ArrayList res=new ArrayList<>();
        for(int i=0 ; i<arr.length;i++)
        {
            sum=0;
            for(int j=i ; j<arr.length;j++)
            {
                sum+=arr[j];
                res.add(sum);
                System.out.print(arr[j]);
            }
            System.out.println();
        }
            Collections.sort(res,Collections.reverseOrder());
            System.out.println("kth largest sum : "+res.get(k-1));

    }

}
