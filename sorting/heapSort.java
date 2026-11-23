
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
        for (int i=n-1 ; i>0 ; i-- )
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, n-i, i);
        }
    }

    static void heapify(int arr[], int n, int i) {

        int leftChild=2*i+1;
        int rightChild=2*i+2;
        int largest=i;
        if(leftChild<n && arr[leftChild]>arr[i])
        {
            largest=leftChild;
        }
        if(rightChild<n && arr[rightChild]>arr[largest])
        {
            largest=rightChild;
        }
        // in above two conditions we just check wether the route element is smaller than left or right , 

        if(largest!=i)
        {
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            heapify(arr,n,largest);
        }
        //in above condition we check adter finding the largest we swap the route with largest element if the condition is true, and again calling the heapify bcz if the next heap is maxx or not
    }
}