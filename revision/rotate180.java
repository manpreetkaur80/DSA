// public class rotate180 {
//     public static void main(String[] args) {
//             int arr[][]={
//                 { 1,2,3},
//                 {4,5,6},
//             {7,8,9}};
//             int m=arr[0].length;
//             int copy[][]=new int[arr.length][arr[0].length];
//             int copy1[][]=new int[arr.length][arr[0].length];
//         for(int i=0 ; i<arr.length;i++)
//         {
//             for(int j=0 ; j<arr[0].length;j++)
//             {
//                 copy[m-j-1][i]=arr[i][j];
//             }
//         }
//          for(int i=0 ; i<arr.length;i++)
//         {
//             for(int j=0 ; j<arr[0].length;j++)
//             {
//                 copy1[m-j-1][i]=copy[i][j];
//             }
//         }
//         for(int i=0 ; i<copy.length;i++)
//         {
//             for(int j=0 ; j<copy[0].length;j++)
//             {
//                 System.out.print(copy1[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }


class rotate180{
    public static void main(String[] args) {
         int arr[][]={
                { 1,2,3},
                {4,5,6},
            {7,8,9}};
            int m=arr[0].length;
            int copy[][]=new int[arr.length][arr[0].length];
            for(int i=0 ; i<arr.length;i++)
            {
                for(int j=0 ; j<arr[0].length;i++)
                {
                    copy[m-i-1][m-j-1]=arr[i][j];
                }
            
            }
             for(int i=0 ; i<copy.length;i++)
        {
            for(int j=0 ; j<copy[0].length;j++)
            {
                System.out.print(copy[i][j]);
            }
            System.out.println();
        }
    }
    
}