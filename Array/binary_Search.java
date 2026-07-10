import java.util.Scanner;
 class binary_Search {
        public static void main(String args[])
        {
            int arr[]=new int[5];
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the elements of the array in sorted order:");
            for(int i=0 ;i<5 ;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the number you want to search:");
            int num=sc.nextInt();
            binarysearch(arr,num);
        }
    static void binarysearch(int[] arr,int num)
    {
        int low=0;
        int high=arr.length-1;
        int mid;
        while(low<=high)
        {
            mid=low+high;
            if(arr[mid]==num)
            {
                System.out.println("the number is found at index :"+mid);
                
            }
            if(arr[mid]<num)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
            
        }
    }
}
