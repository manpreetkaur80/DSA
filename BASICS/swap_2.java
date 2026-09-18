public class swap_2 {
    swap_2(int a , int b)
    {
        System.out.println("before swap a: "+a+" b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap a: "+a+" b: "+b);
    }
    public static void main(String args[])
    {
        swap_2 ob=new swap_2(5,10);
    }
}
