public class reverse {
    reverse(int n){
        int rev=0 , rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reversed Number : "+rev);

    }
    public static void main(String args[]){
        reverse ob=new reverse(1234);
    }
}
