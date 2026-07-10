public class removeAllocc {
    public static void main(String args[])
    {
        String str="hello world";
        char ch='o';
        StringBuilder str1=new StringBuilder(str);
        for(int i=0 ; i<str1.length();i++)
        {
            if(str1.charAt(i)==ch)
            {
                str1.deleteCharAt(i);
                i--;
            }

        }
        // str=str.replace(String.valueOf(ch),"x");
        System.out.println("String after removing all occurrences of character "+ch+" is: "+str1.toString());
    }
}
