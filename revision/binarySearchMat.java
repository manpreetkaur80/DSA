public class binarySearchMat {
 public static void main(String[] args) {
    int arr[][]={
        {1,2,3},
        {5,6,7},
        {4,8,9}
    };
    int x=6;
    int n=3 , m=3 ,mid;
    int low=0 , high=n*m-1;
    while(low<=high)
    {
        mid=(low+high)/2;
        int row=mid/m;
        int col=mid%m;
        if(arr[row][col]==x)
        {
            System.out.println("Elemnt "+x+" found at row "+(row+1)+" and column "+(col+1));
            return;
        }
        if(arr[row][col]<x)
        {
            low=mid+1;
        }
        else if(arr[row][col]>x)
        {
            high=mid-1;
        }
    }
    }   
}
