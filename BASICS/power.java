import java.util.Scanner;
public class power {
    public static void main(String argsp[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int pow;
        boolean istrue=false;
        for(int i=1 ; i<=x;i++)
        {
            
            if((int)Math.pow(x,i)==y)
            {
                pow=i;
                istrue=true;
               System.out.print("power : "+pow);
                 break;
            }
           
        }
       
    if(istrue==false)
    {
        System.out.print("not found");
    }
    }
}
