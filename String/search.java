public class search {
    public static void main(String[] args) {
        String str="Hello";
        char c='l';
        for(int i=0 ; i<str.length();i++)
        {
            if(c==str.charAt(i))
            {
                System.out.println(i);
            }
        }
    }
}
