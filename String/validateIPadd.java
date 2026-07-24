public class validateIPadd {
    public static void main(String[] args) {
        String str="192.404.01.12a";
        String str1[]=str.split("\\.");
        boolean isvalid=true;
        
            if(str1.length!=4)
            {
                System.out.println("not valid 3 stages");
                return;
            }
        for(String part :str1)
        {
            // System.out.println(part);
        
            if(part.length()==0)
            {
                System.out.println("part is empty");
                return;
            }
           for(int i=0 ; i<part.length();i++)
           {
             if(Character.isDigit(part.charAt(i))!=true)
            {
                System.out.println("the part contains no all digits");
                return;
            }
           }
            int num = Integer.parseInt(part);
            if(num < 0 || num > 255)
            {
                isvalid=false;
                break;
            }
            else{
                isvalid=true;
            
            }
        }

            if(isvalid)
            {
                System.out.println("is valid ip address");
            }
            else{
                System.out.println("not valid");
            }
    }
}
