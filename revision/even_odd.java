import java.util.Arrays;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
            int arr[]={
                1,5,4,3,2,1
            };
            int temp;
            Arrays.sort(arr);
            for(int i=0 ; i<arr.length;i+=2)
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            for(int i=0 ; i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }

    }
}
