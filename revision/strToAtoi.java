public class strToAtoi {
    public static void main(String[] args) {
        String str="-123456789999";
        int sign=1;
        int res=0 ;
        int idx=0;
        while (idx<str.length()&&str.charAt(idx)==' ') {
                idx++;
        }
        while(idx<str.length()&&(str.charAt(idx)=='+'||str.charAt(idx)=='-'))
        {
            if(str.charAt(idx)=='-')
            {sign=-1;}
            idx++;
        }
        while (idx<str.length()&&str.charAt(idx)>='0'&&str.charAt(idx)<='9') {
            if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&str.charAt(idx)>'7'))
            {
                res=(sign==1? Integer.MAX_VALUE:Integer.MIN_VALUE);
                System.out.println(res);
                return;
            }
            
        
        res=res*10+(str.charAt(idx++)-'0');
          
    }
      res=res*sign;
            System.out.println(res);
    }

}
