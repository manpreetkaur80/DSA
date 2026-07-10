import java.util.*;
public class even_positioned {
    public static void main(String[] args) {
        int arr[]={1,5, 4 , 3 ,2 , 1,8 , 9 , 6};
       Arrays.sort(arr);
        for(int i=0 ; i<arr.length-1;i+=2)
        {
            
                    swap(arr, i, i+1);
            
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int a ,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;   
    }
}
