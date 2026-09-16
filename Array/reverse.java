

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int temp[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0 ; i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    
        for(int i=0 ; i<arr.length;i++)
        {
              temp[i]=arr[arr.length-1-i];
            
        }
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(temp[i]);
        }
    }
}
