public class samestr {
    public static void main(String[] args) {
        String str1 = "hellow";
        String str2 = "hellow";
       boolean istrue=true;
       System.out.println( str1.equals(str2));
        for(int i=0 ; i<str1.length();i++)
        {
           
            if(str1.charAt(i)!=str2.charAt(i))
            {
                istrue=false;
            }
            
         }
         System.out.println("is true :"+istrue);
    }

}
