public class pangram_1 {
    public static void main(String[] args) {
        // String str="The quick brown fox jumps over the lazy dog";
        String str="hello";
        str = str.toLowerCase();
        int arr[]=new int[26];
        for(int i='a'; i<='z'; i++) {
            boolean found = false;
            for(int j=0 ; j<str.length();j++)
            {
                if(str.charAt(j)==i){
                    arr[i-'a']++;
                    found = true;
                    break;
                }
            
            }
            if(!found) {
                System.out.println("The string is not a pangram.");
                return;
            }
        }
        System.out.println("The string is a pangram.");
    }
}
