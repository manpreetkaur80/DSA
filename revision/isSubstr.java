public class isSubstr{
    public static void main(String[] args) {
        String str="hello world";
        String sub="word";
        int index=0;
        for(int i=0 ; i<str.length();i++)
        {
            boolean istrue=true;
            for(int j=0 ; j<sub.length();j++)
            {
                if(str.charAt(i+j)!=sub.charAt(j))
                {
                    istrue=false;
                    break;
                }
            }
            if(istrue){
                index=i;
            }
        }
        System.out.println("sub string found at : "+(index));
    }
}