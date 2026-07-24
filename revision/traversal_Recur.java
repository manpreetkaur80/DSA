public class traversal_Recur {
 public static void main(String[] args) {
    int arr[][]={
        {1,2,3},
        {4,5,6},
        {4,3,2}
    };
    traversal(arr,0,0);
 }   
 static void traversal(int[][]arr,int i , int j)
 {
    if(i==arr.length)
    {
        return;
    }
    System.out.println("index i : "+i+ " index j : "+j+" element  : "+arr[i][j]);
    if(j+1<arr[0].length)
    {traversal(arr, i, j+1);}
    else if(i+1<arr.length)
    {
        traversal(arr, i+1, 0);
    }
}
}
