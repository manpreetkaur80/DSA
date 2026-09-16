class exponentialSearch{
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,60,70,80,90};
        int n=arr.length;
        int target=60;
        int i=1;
        while(i<n && arr[i]<=target)
        {
            i*=2;
            
        }
        binary(i/2 ,Math.min(i, n - 1),arr,target);
    }
    static void binary(int low , int high , int arr[], int target)
    {
        while(low<=high)
        {
        int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                System.out.println("found at index: " + mid);
                break;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
        }

    }
}