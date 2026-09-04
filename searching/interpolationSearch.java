public class interpolationSearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int target=50;
        search(arr,target);
    }
    static void search(int arr[], int target)
    {
        int low=0 , high=arr.length-1;
        while(low <= high && target >= arr[low] && target <= arr[high])
        {
            
            int pos=low+(((target-arr[low])*(high-low))/(arr[high]-arr[low]));
            if(arr[pos]==target)
            {
                System.out.println("index  : "+(pos+1));
                return;
            }
            else if(arr[pos]<target)
            {
                low=pos+1;
            }
            else if(arr[pos]>target)
            {
                high=pos-1;
            }
        }
    }
}
