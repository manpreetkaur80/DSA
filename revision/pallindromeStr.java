public class pallindromeStr {
    public static void main(String[] args) {
        String str="helleh0o";
        StringBuilder rev=new StringBuilder();
        for(int i=str.length()-1;i>=0 ; i--)
        {
            rev.append(str.charAt(i));
        }
        String str2=new String(rev);
        if(str.equals(str2))
        {
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not ");
        }
    }
}
