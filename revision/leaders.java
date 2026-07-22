public class leaders{
    public static void main(String[] args) {
        int arr[]={19,22,13,16,15,4,5,2};
        int leaders[]=new int[arr.length];
        for(int i=0 ; i<arr.length;i++)
        {
            boolean isleader=true;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
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
        for(int i=0 ; i<leaders.length;i++)
        {
            if(leaders[i]!=0)
            {
            System.out.println(leaders[i]);
        }
    }
    }
}