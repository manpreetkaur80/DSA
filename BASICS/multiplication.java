class multiplication{
    void mult(int n , int i)
    {
        if(i==11)
        {
            return;
        }
       System.out.println(n+"*"+i+"="+(n*i));
       i++;
       mult(n, i);  
    }
    public static void main(String args[])
    {
        multiplication m=new multiplication();
        m.mult(10 , 1);
    }
}