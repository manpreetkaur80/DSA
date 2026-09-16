public class kthnonRepeat_2 {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int k = 2;
        int[] freq = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                count++;
                if (count == k) {
                    System.out.println("k-th non-repeating char: " + str.charAt(i));
                    break;
                }
            }
        }
    }

}
