public class validIP {
    public static void main(String[] args) {
        String str="192.4.011.120";
        String []str1=str.split("\\.");
        boolean isvalid=false;
        if(str1.length!=4)
        {
            System.out.println("not valid other than 4 stages");
            return;

        }
        for(String part : str1)
        {
            if(part.length()==0)
            {
                System.out.println("part is empty : "+part);
                return;
            }
            for(int i=0 ; i<part.length();i++)
            {
                if(Character.isDigit(part.charAt(i))!=true)
                {
                    System.out.println("the part is not containts all digits "+part);
                    return;
                }

            }
            int num=Integer.parseInt(part);
            if(num<0 ||num>255)
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
            System.out.println("valid IP address");
        }
        else
        {
            System.out.println("not valid IP address");
        }
    }
}


