public class insertChar {
    public static void main(String[] args) {
        String str="hello";
        char c='x';
        int index=3;
        String res=str.substring(0,index)+c+str.substring(index);
        System.out.println(res);
        String del=res.substring(0,index)+res.substring(index+1);
        System.out.println(del);
        boolean istrue=true;
        for (int i=0 ;i<res.length();i++)
        {
             istrue=true;
            for(int j=0 ; j<del.length();j++)
            {
                if(res.charAt(i)!=del.charAt(j))
                {
                    istrue=false;
                    break;
                }
            }
            
        }
        if(istrue)
        {
            System.out.println("strings are same");
        }
        else{
            System.out.println("strings are not same");
        }
     
        StringBuilder rev=new StringBuilder();
        for(int i=str.length()-1;i>=0 ;i--)
        {
            rev.append(str.charAt(i));
        }
        System.out.println("reverse : "+rev);
    }
}
