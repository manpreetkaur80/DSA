import java.util.Scanner;
public class linear_Search {
    public static void main(String args[])
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0 ;i<5 ;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search:");
        int num=sc.nextInt();
        int result=linearsearch(arr,num);
        if(result==-1)
        {
            System.out.println("Element not found in the array.");
        }
        else
        {
            System.out.println("Element found at index: " + result);
        }
    }
    static int linearsearch(int[] arr, int num)
    {
        for(int i=0;i<5;i++)
        {
            if(arr[i]==num)
            {
                return i;
            }
            
       
        }
         return -1;
    }
}

