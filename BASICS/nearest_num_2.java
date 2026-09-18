public class nearest_num_2 {
    void nearest(int m , int n)
    {
        int q=n/m;
        int n1=q*m;
        int n2= m*n>0? (q+1)*m : (q-1)*m;
        if(Math.abs(n-n1)<Math.abs(n-n2))
        {
            System.out.println("nearest number "+n1);
        }
        else
        {
            System.out.println("nearest number "+n2);
        }
    }
    public static void main(String args[])
    {
        nearest_num_2 ob=new nearest_num_2();
        ob.nearest(4,11);
    }
}
