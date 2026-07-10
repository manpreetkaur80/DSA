import java.util.*; 
public class medianInSorted {
     public static void main(String args[])
    {
        int[][] arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0 ; i< arr.length;i++)
        {
            for(int j=0 ; j< arr[0].length;j++ )
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int n=arr.length;
        int m=arr[0].length;
        int[] ans=new int[n*m];
        int k=0;
        for(int i=0 ; i< arr.length;i++)
        {
            for(int j=0 ; j< arr[0].length;j++ )
            {
                ans[k]=arr[i][j];
                k++;
            }
        }
    
        Arrays.sort(ans);
        for(int i=0 ; i< ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        int mid=(n*m)/2;
        System.out.println(ans[mid]+"median");

    }
    }