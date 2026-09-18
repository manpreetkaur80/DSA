public class insertionSort {
    public static void main(String[] args) {
        int arr[]={5,6,4,1};
        int n=arr.length;
        int key;
        for(int i=1 ; i<n ;i++)
        {
            key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0 ; i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
