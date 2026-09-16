public class kthdistance {
    public static void main(String[] args) {
        int arr[]={1,2,0,5,3,1,4};
        int k=3;
         boolean isfound=false;
        for(int i=0 ; i<arr.length;i++)
        {
           
            for(int j=i+1;j<=i+k&&j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                isfound=true;
                break;
            }
        }
 
        }
        if(isfound)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
