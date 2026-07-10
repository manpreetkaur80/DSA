public class pangram{
    public static void main(String[] args) {
        // String str = "The quick brown fox jumps over the lazy dog";
        String str = "The quimps over the lazy dog";
        str = str.toLowerCase();
        boolean isPangram = true;
        int arr[]=new int[26];
        for(int i=0 ; i<str.length();i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                arr[str.charAt(i)]++;
            }
            
        }
       for(int i='a' ; i<='z';i++)
        {
            if(arr[i]==0)
            {
                isPangram = false;
                break;
            }  
         }
         if(isPangram)
         {
             System.out.println("The string is a pangram.");
         }
         else
         {
             System.out.println("The string is not a pangram.");
         }
    }
}