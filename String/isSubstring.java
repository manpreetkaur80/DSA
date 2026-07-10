public class isSubstring {
    public static void main(String[] args) {
        String str="Hellow world";
        String sub="wor";
        int index=0;
        for(int i=0 ; i<str.length();i++)
        {
            boolean is=true;
            for(int j=0 ; j<sub.length();j++)
            {
                if(str.charAt(i+j)!=sub.charAt(j))
                {
                    is=false;
                    break;
                }
                
            }
            if(is)
            {
                index=i;
            }
        }
        System.out.println("substring at index : "+index+"");    
    }
}
