public class celebrity {
    public static void main(String[] args) {
        int arr[][]={
            {0,1,0},
            {0,0,0},
            {0,1,0}
        };
        int i=0 , j=arr.length-1;
        while(i<j)
        {
            if(arr[j][i]==1)
            {
                j--;
            }
            else{
                i++;
            }
        }
        int cel=i;
        for(int k=0 ; k<arr.length;k++)
        {
            if(cel==k)
            {
                continue;
            }
            if(arr[k][cel]==0 || arr[cel][k]==1)
            {
                System.out.println(cel + " is not celebrity");
                return;
            }
            else{
                System.out.println("celebrity : "+cel);
            }
        }
        
    }
}
