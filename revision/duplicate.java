public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6,7,7,8    };
        int ind=0;
        int dup[]=new int[arr.length];
        for(int i=0 ; i<arr.length;i++)
        {
            boolean isdup=false;
            for(int j=0;j<i;j++)
            {

                if(arr[i]==arr[j])
                {
                    isdup=true;
                    break;
                }
                
            }
            if(!isdup)
                {
                    dup[ind]=arr[i];
                    ind++;
                }
     
        }
        for(int i=0 ; i<dup.length;i++)
        {
            if(dup[i]!=0)
            System.out.println(dup[i]);
        }
    }
}
