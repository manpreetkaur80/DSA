public class pro2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int num=4;
        for(int i=0 ; i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                System.out.println("index : "+(i+1));
            }
        }
        int low=arr[0];
        int high=arr[arr.length-1];
        
        while (low<high) {
        int mid=(low+high)/2;
            if(arr[mid]==num)
                {
                    System.out.println("element found at index : "+(mid+1));
                    return;
                }
                if(num<arr[mid])
                {
                    high=mid-1;
                }
                if(num>arr[mid])
                {
                    low=mid+1;
                }
            }
    }
}
