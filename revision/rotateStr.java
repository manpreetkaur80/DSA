public class rotateStr {
    public static void main(String[] args) {
        char[]str={'h','e','l','l','o'};
        char[] res=new char[str.length];
        for(int i=0 ; i<2;i++)
        {
            char last=str[str.length-1];
            for(int j=str.length-1 ; j>0;j--)
            {
                    str[j]=str[j-1];
            }
            str[0]=last;
        }
      System.out.println(str);
    }    
}
