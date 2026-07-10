public class palindrome{
    public static void main(String[] args) {
        String str1="helleh";
        StringBuilder str2=new StringBuilder();
        for(int i=str1.length()-1 ; i>=0;i--)
        {
            str2.append(str1.charAt(i));
            
        }
        String str3 = str2.toString();
        if(str1.equals(str3))
        {
            System.out.println("string is palindrome");
        }
        else
        {
            System.out.println("string is not pallindrome");
        }
        
    }
}