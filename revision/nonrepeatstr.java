public class nonrepeatstr {
    public static void main(String[] args) {
        String str="hello";
        outer:
        for(int i=0 ; i<str.length() ;i++)
        {
            char ch=str.charAt(i);
            for(int j=i+1; j<str.length();j++)
            {
                if(ch==str.charAt(j))
                {
                    break;
                }
                if(j==str.length()-1)
                {
                    System.out.println("first repeating : "+ch);
                    break outer;
                }
            }
        }
    }
}
