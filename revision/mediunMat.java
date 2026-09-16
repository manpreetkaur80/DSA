import java.util.Arrays;

public class mediunMat {
        public static void main(String[] args) {
            int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
            int copy[]=new int[arr.length*arr[0].length];
            int k=0 ; 
            for(int i=0 ; i<arr.length;i++)
            {
                for(int j=0 ; j<arr[0].length;j++)
                {
                    copy[k]=arr[i][j];
                    k++;
                }
            }
            Arrays.sort(copy);
            int mid=copy.length/2;
            for(int i=0 ; i<copy.length;i++)
            {
                System.out.println(copy[i]);
            }
            System.out.println("mid element :"+copy[mid]);
        }    
}
