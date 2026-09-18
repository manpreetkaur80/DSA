public class three_divisor {
    public static void main(String[] args) {
        int n=25;
        int count=0;
        for(int i=2 ;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println(n+"the number have only three divisor");
        }
        else{
            System.out.println("not valid");
        }
    }
}
