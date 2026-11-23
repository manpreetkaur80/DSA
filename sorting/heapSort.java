
import java.util.*;
class heapSort {

    public static void main(String[] args) {
        int arr[] = { 4, 10, 3, 5, 1 };

      
        heapSorting(arr);


        System.out.println("Sorted array is: " + Arrays.toString(arr));
        
    }

    static void heapSorting(int arr[]) {

        // Step 1: Build Max Heap
    
            int n=arr.length;
            for(int i=n/2-1;i>=0;i--)
            {
                heapify(arr,n,i);
            }
        
        // Step 2: Extract elements one by one
    }

    static void heapify(int arr[], int n, int i) {

        int leftChild=2*i+1;
        int rightChild=2*i+2;
        int largest=i;
        if(leftChild<n && arr[leftChild]>arr[i])
        {
            largest=leftChild;
        }
        if(rightChild<n && arr[rightChild]>arr[i])
        {
            largest=rightChild;
        }
        if(largest!=i)
        {
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            heapify(arr,n,largest);
        }

    }
}