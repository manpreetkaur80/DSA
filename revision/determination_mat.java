public class determination_mat {
    static int finddeterminant(int arr[][], int n) {
        if (n == 1) {
            return arr[0][0];
        }
        if (n == 2) {
            return arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
        }
        int determinant = 0;
        int sign = 1;
        for (int col = 0; col < n; col++) {
            int minor[][] = new int[n - 1][n - 1];
            for (int i = 1; i < n; i++) {
                int minorcol = 0;
                for (int j = 0; j < n; j++) {
                    if (col == j) {
                        continue;
                    }
                    minor[i - 1][minorcol] = arr[i][j];
                    minorcol++;
                }
            }
            determinant += sign * arr[0][col] * finddeterminant(minor, n - 1);
            sign = -sign;
        }
        return determinant;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 2, 5, 3 },
                { 1, -2, -1 },
                { 3, 4, 2 }

        };
        System.out.println("determinanint : " + finddeterminant(arr, arr.length));
    }
}
