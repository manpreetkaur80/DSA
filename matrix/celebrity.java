public class celebrity {
    public static int celb(int arr[][]) {
        int n = arr.length;
        int i = 0, j = n - 1;

        // elimination loop
        while (i < j) {
            if (arr[j][i] == 1) {
                j--; // j knows i → j cannot be celebrity
            } else {
                i++; // j does not know i → i cannot be celebrity
            }
        }

        int c = i; // candidate

        // verification loop
        for (int k = 0; k < n; k++) {
            if (k == c) continue;
            if (arr[c][k] == 1 || arr[k][c] == 0) {
                return -1; // not celebrity
            }
        }

        return c; // celebrity found
    }

    public static void main(String[] args) {
        int arr[][] = {
            {0,0,1,0},
            {0,0,1,0},
            {0,0,0,0},
            {0,0,1,0}
        };
        System.out.println(celb(arr));
    }
}