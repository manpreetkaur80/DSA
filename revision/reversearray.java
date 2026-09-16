public class reversearray {
    
    public static void main(String[] args) {
       int arr[]={1,2,4,4,6};
       int temp[]=new int[arr.length];
       
        for(int i=0 ; i<arr.length;i++)
        {
                temp[i]=arr[arr.length-1-i];
        }
        
        for(int i=0 ; i<arr.length;i++)
        {
            

            System.out.println(temp[i]);
        }
    }
}

