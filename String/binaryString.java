public class binaryString {
    public static void main(String [] args)
    {
        String str="1010101";
        boolean isBinary=true;
        for(int i=0 ; i<str.length();i++)
        {
            if(str.charAt(i)!='0' && str.charAt(i)!='1')
            {
                isBinary=false;
                break;
            }
        }
        if(isBinary)
        {
            System.out.println("Binary string");
        }
        else
        {
            System.out.println("Not a binary string");
        }
    }
}
