public class binary_search {
    
    public static boolean search(int arr[][], int x)
    {
        int n=arr.length;
        int m=arr[0].length;
        int lo=0;
        int hi=n*m-1;
        while(hi>=lo)
        {
            int mid=(lo+hi)/2;
            int row=mid/m;
            int col=mid%m;
            if(arr[row][col]==x)
            {
                return true;
            }
            else if(arr[row][col]<x)
            {
                lo=mid+1;
            }
            else
            {
                hi=mid-1;
            }
          

        }
          return false;
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        int target=19;
        if(search(arr,target)){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
