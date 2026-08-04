import java.util.Arrays;

public class ternarySearch {
    public static void main(String[] args) {
        int arr[] = {10,9,19,45,34,20,12,78,2};
        Arrays.sort(arr);

        int low = 0, high = arr.length - 1;
        int key = 45;
        for(int i=0 ; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            if (arr[mid1] == key) {
                System.out.println("Index: " + (mid1+1));
                return;
            }
            if (arr[mid2] == key) {
                System.out.println("Index: " + (mid2+1));
                return;
            }

            if (key < arr[mid1]) {
                high = mid1 - 1;
            } else if (key > arr[mid2]) {
                low = mid2 + 1;
            } else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }
        System.out.println("Key not found");
    }
}
