class arriToi {
 public static void main(String[] args) {
    int arr[]={-1,6,1,9,3,2,4};
    for(int i=0 ; i<=arr.length;i++)
    {
        for(int j=0 ; j<arr.length;j++)
        {
            if(arr[j]==i)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int i =0 ; i<arr.length;i++)
    {
        if(arr[i]!=i)
        {
            arr[i]=-1;
        }
        System.out.println(arr[i]);
    }
 }
}
