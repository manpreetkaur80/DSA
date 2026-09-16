public class circular {
    public static void main(String[] args) {
        
    int arr[]={1,2,3};
    int d=2;
    int sum=0;
    int minsum=Integer.MAX_VALUE;
    int maxsum=Integer.MIN_VALUE;
    int circularsum=0;
        int total=0;
    
    for(int i=0 ; i<arr.length;i++)
    {
        total+=arr[i];
        sum=0;
        for(int j=i ; j<arr.length;j++)
        {
            sum+=arr[j];
            maxsum=Math.max(sum,maxsum);
            minsum=Math.min(sum, minsum);
        }
    }
    circularsum=total-minsum;
    System.out.println(circularsum);
}
}
