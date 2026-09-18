public class natural_sum {
    natural_sum(int n)
    {
        int sum=0;
        for(int i=0 ; i<n ;i++)
        {
            sum=sum+(i*i);
        }
        System.out.print("sum :"+sum);
    }
    public static void main(String args[])
    {
        natural_sum ob=new natural_sum(5);
    }
}
