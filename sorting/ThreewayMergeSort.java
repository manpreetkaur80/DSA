import java.util.Arrays;
public class threewayMergeSort {
    public static void main(String[] args) {

        int arr[] = {12, 5, 8, 20, 3, 15, 7, 10, 2};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void mergeSort(int arr[], int low, int high) {
        // this is a base condition when one or zero elemnt remains bcz we no need to comapare the single element with itself 
        if (low >= high) {
            return;}
            
        int mid1 = low + (high - low) / 3;
        int mid2 = low + 2 * (high - low) / 3 + 1;

        // Dividing array into three parts
        mergeSort(arr, low, mid1);
        mergeSort(arr, mid1 + 1, mid2);
        mergeSort(arr, mid2 + 1, high);

        // Merge the three sorted parts 
        merge(arr, low, mid1, mid2, high);
    }

    static void merge(int arr[], int low, int mid1, int mid2, int high) {

        int temp[] = new int[high - low + 1];

        int i = low;
        int j = mid1 + 1;
        int k = mid2 + 1;
        int index = 0;

        // Compare elements from all three parts ,oky here i indicates the first partition , j checks the 2nd partition and k checks the 3rd
        //this loop continuous until the current element is scanned of each part , 
        while (i <= mid1 && j <= mid2 && k <= high) {
            //if the current element of first part is smaller than it is added to temp arr and i++ and than again whileloop starts , from i=1 and j=0 k =0 
            //j and k remains there only ,
            if (arr[i] <= arr[j] && arr[i] <= arr[k]) {
                temp[index++] = arr[i++];
            }
            else if (arr[j] <= arr[i] && arr[j] <= arr[k]) {
                temp[index++] = arr[j++];
            }
            else {
                temp[index++] = arr[k++];
            }
        }

        // Merge remaining elements from first and second parts , if third part get empty first 
        while (i <= mid1 && j <= mid2) {
            if (arr[i] <= arr[j]) {
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }

        // Copy remaining elements from first part , if both j and k part get emty
        while (i <= mid1) {
            temp[index++] = arr[i++];
        }

        // Copy remaining elements from second part, if i and k empty 
        while (j <= mid2) {
            temp[index++] = arr[j++];
        }

        // Copy remaining elements from third part, if i and j empty 
        while (k <= high) {
            temp[index++] = arr[k++];
        }

        // Copy temporary array back to original array , 
        for (int x = 0; x < index; x++) {
            arr[low + x] = temp[x];
        }
    }
}

