public class equalRotation {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hell";
        int d=str1.length();
        boolean isequal=false;
        for(int i=0 ; i<d;i++)
        {
            char last=str1.charAt(str1.length()-1);
            str1=last+str1.substring(0,str1.length()-1);
            if(str1.toString().equals(str2))

                {
                    isequal=true;
                }

            }
            if(isequal)
            {
                System.out.println("similar strings");
            }
            else{
                System.out.println("not similar rotation ");
            }
    }
}
