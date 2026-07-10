import java.util.Scanner;

public class lader {
    public static void main(String[]args)
    {
        int arr[]=new int[5];
        int lader[]=new int[5];
        System.out.print("enter array");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0 ; i<arr.length ;i++)
        {
            boolean isleader=true;
            for(int j=i+1 ;j<arr.length ;j++)
            {
                if(arr[i]<arr[j])
                {
                    isleader=false;
                    break;
                }
                
            }
            if(isleader)
            {
                lader[i]=arr[i];
            }

        }
        System.out.print("the result lader :");
        for(int number : lader)
        {
            if(number!=0)
                System.out.println(number);
        }
    }
}
