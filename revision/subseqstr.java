public class subseqstr {
    public static void main(String[] args) {
        String s1="abc";
        String s2="xyabc";
        int i=0 , j=0;
        while(i<s1.length()&&j<s2.length())
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                i++;
            }
            j++;
        }
        System.out.println(i==s1.length());
    }
}
