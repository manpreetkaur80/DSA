public class leaders {
    public static void main(String[] args) {
        
        int arr[]={2,17,4,3,5};
        int leaders[]=new int[arr.length];
        for(int i=0 ; i<arr.length ;i++)
        {boolean isleader=true;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                   isleader=false;
                    break;
                }
               
            }
             if(isleader)
                {
                   leaders[i]=arr[i]; 
                }
           
        }
         for(int i=0 ; i<arr.length;i++)
            {
                System.out.println(leaders[i]);
            }
        }
}
