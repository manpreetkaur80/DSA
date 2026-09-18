// public class super_prime {
//     void sprime(boolean[] isprime ,int n )
//         {
            
//             boolean[] issuperprime=new boolean[n+1];
//             for(int i=2; i<=n;i++){
//                 if(n%i!=0)
//                 {
//                 isprime[i]=true;
//                 }
//                 else{
//                     isprime[i]=false;
//                 }
//             }
//             for(int i=2 ; i<=n;i++)
//             {
//                 if(isprime[i]==true)
//                 {
//                     for(int j=2 ; j<=n;j++)
//                     {
//                         if(i%j!=0)
//                         {
//                         issuperprime[j]=true;
//                         System.out.println(j);
//                         }
//                     }
//             }
//         }
//     }
            
//         }
//     public static void main(String[] args) {
//         super_prime ob= new super_prime();
//         boolean[] isprime = new boolean[18];
//         ob.sprime(isprime,17);
//     }





public class super_prime {
    boolean isprime(int n)
    {

        for(int i=2 ; i*i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
            
        }
        return true;
    }
    void sprime(int n)
    {
        int prime_index=0;
        for(int i=2 ; i<n ;i++)
        {
            if(isprime(i))
            {
                prime_index++;
                if(isprime(prime_index))
                {
                    System.out.println("the element "+i+" is super prime");
                }
            }
        }
    }
    public static void main(String[] args) {
        super_prime s=new super_prime();
        s.sprime(18);
    }
}
