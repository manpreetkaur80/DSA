import java.util.Scanner;

public class k_distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        // int arr1[]=new int[6];
        int k=3;
        for(int i=0 ;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            } 
            boolean isfound=false;
        for(int i=0 ;i<arr.length;i++)
        {
            
            for(int j=i+1 ;j<=i+k && j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    isfound=true;
                    break;
                }
            }
           
            }

             if(isfound)
            {
                System.out.print("yesss");
            }
            else{
                System.out.print("nooo");
            }
    }
}
