
import java.util.*;
public class productArr {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int res[]=new int[arr.length];
        Arrays.fill(res,1);
        for(int i=0 ; i<arr.length;i++)
        {
            for(int j=0 ; j<arr.length;j++)
            {
                if(i!=j)
                {
                    res[i]=res[i]*arr[j];
                }
            }
            System.out.println(res[i]);
        }
            
    }    
}
