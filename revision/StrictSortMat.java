import java.util.Arrays;

public class StrictSortMat {
    public static void main(String[] args) {
        int arr[][]={{3,6,5},{9,7,4},{1,2,3}};
        int copy[]=new int[9];
         int k=0 ;
        for(int i=0 ; i<arr.length;i++)
        {
            for(int j=0 ; j<arr.length;j++)
            {
               
                copy[k]=arr[i][j];
                k++;
            }
        }
       
        Arrays.sort(copy);
        k=0;
        for(int i=0 ; i<arr.length;i++)
        {
            for(int j=0 ; j<arr.length;j++)
            {
                
                arr[i][j]=copy[k];
                    k++;
            }
        }
        for(int i=0 ; i<arr.length;i++)
        {
            for(int j=0 ; j<arr.length;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }    
}
