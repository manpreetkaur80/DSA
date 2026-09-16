public class camelCaseStr {
    public static void main(String[] args) {
        String str="hello world java";
        StringBuilder str1=new StringBuilder(str);
        for(int i=0 ; i<str1.length();i++)
        {
            if(str1.charAt(i)==' ')
            {
                str1.deleteCharAt(i);
                str1.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
                
            }
        }
        System.out.println(str1);
    }
}
