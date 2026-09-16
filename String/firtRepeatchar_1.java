public class firtRepeatchar_1 {
    public static void main(String args[])
    {
        String str="haeloow";
        int arr[]=new int[256];
        for(int i=0 ; i<str.length();i++)
        {
            arr[str.charAt(i)]++;
             if(arr[str.charAt(i)]>1)
            {
                System.out.println("First repeating character is: "+str.charAt(i));
                break;
            } 
        // }
        // for(int i=0 ; i<arr.length;i++)
        // {
        //     if(arr[i]>1)
        //     {
        //         System.out.println("First repeating character is: "+(char)i);
        //         break;
        //     }  
        //  }
    }
    }}