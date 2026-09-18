public class divisibility_4 {
   void divisible(String str)
    {
        int length=str.length();
        int num=Integer.parseInt(str);
        boolean istrue=false;
        if(length<=2)
        {
            if(num%4==0)
            {
                istrue=true;
            }
        }
        String last_two=str.substring(str.length()-2);
        int last_two_digits=Integer.parseInt(last_two);
        if(last_two_digits%4==0)
        {
            istrue=true;
        }
        if(istrue)
        {
            System.out.print("the number "+num+" is divisible by 4");
        }
        else
        {
            System.out.print("the number is not by 4");
        }
    }
    public static void main(String[] args) {
        divisibility_4 ob=new divisibility_4();
        ob.divisible("123450");
    }
}
