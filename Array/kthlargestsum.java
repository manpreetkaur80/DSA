import java.util.*;

public class kthlargestsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        int kth = 3; // example K
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // generate all subarray sums
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                res.add(sum); // store only final sum for subarray [i..j]
                System.out.print("["+arr[j]+']');
            }
            System.out.println();
        }

        // sort descending
        Collections.sort(res, Collections.reverseOrder());

        // print K-th largest
        System.out.println("kth largest sum : " + res.get(kth - 1));
    }
}
