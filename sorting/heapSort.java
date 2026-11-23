
import java.util.*;
class heapSort {

    public static void main(String[] args) {
        int arr[] = { 4, 10, 3, 5, 1 };

      
        heapSorting(arr);


        System.out.println("Sorted array is: " + Arrays.toString(arr));
        
    }

    static void heapSorting(int arr[]) {

                // in this step I am building max heapp , step 1 in our dry run
            int n=arr.length;
            for(int i=n/2-1;i>=0;i--)
            {
                heapify(arr,n,i);
            }
        
        // Extract elements one by one , step 2 , 2.1 2.2 , 2.3 in for loop 
        for (int i=n-1 ; i>0 ; i-- )
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, i,0);
        }

        // oky here i at n bcz we need too reduce the size of hepify arr , we are not going to include the last element , and i is the decreasing element here
        // here 0 in place of i bcz we need to start the heapify from the firt position , and i in the heapify function doing the same , indicates the starting point of heapify
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