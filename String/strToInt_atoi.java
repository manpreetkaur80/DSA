import java.util.Scanner;

public class strToInt_atoi {
    public static void main(String[] args) {
        String str="-1239899898788";
        int sign=1 ,res=0,idx=0;
        while(idx<str.length() && str.charAt(idx)==' ')
        {
            idx++;
        }
        if(idx<str.length()&&(str.charAt(idx)=='-'||str.charAt(idx)=='+'))
        {
            if(str.charAt(idx)=='-')
            {
                sign=-1;
            }
        idx++;

        }
        while (idx<str.length()&&str.charAt(idx)>='0'&&str.charAt(idx)<='9') {
             if (res > Integer.MAX_VALUE / 10 || 
                   (res == Integer.MAX_VALUE / 10 && str.charAt(idx) - '0' > 7)) {
                res=( sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                System.out.print(res);
                return;
            }
            res = res * 10 + (str.charAt(idx++) - '0');
        }
        res=res*sign;
        System.out.println(res);
    }
}
