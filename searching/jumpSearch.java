class jumpSearch {
    public static void main(String[] args) {

        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13,
                     21, 34, 55, 89, 144, 233, 377, 610};

        int n = arr.length;
        int m = (int) Math.sqrt(n);

        int element = 89;

        int jump = m;
        int prev = 0;


        while (jump < n && arr[jump] < element) {
            prev = jump;
            jump += m;
        }

       
        for (int i = prev; i < Math.min(jump, n); i++) {

            if (arr[i] == element) {
                System.out.println("Element found at " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }
}