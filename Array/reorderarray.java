import java.util.Scanner;

class reorderarray{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int index[]=new int[5];
        System.out.println("enter the input array");
        for(int i=0 ; i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
         System.out.println("enter the index array");
        for(int i=0 ; i<arr.length;i++)
        {
            index[i]=sc.nextInt();
        }
        int temp[]=new int[5];
        int ind;
        for(int i=0 ; i<index.length;i++)
        {
            ind=index[i];
            for(int j=i ; j<arr.length;j++)
            {
                temp[ind]=arr[j];
               break;
            }
        }
        for(int a=0 ; a<temp.length;a++)
        {
            System.out.println(temp[a]);
        }
    }
}

//   for (int i = 0; i < arr.length; i++) {
//             reordered[index[i]] = arr[i];
//         }