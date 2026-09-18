public class sum_digits_2 {
    int sum_digits(int n){
        if(n==0){
            return 0;
        }
        return n%10 +sum_digits(n/10);
    }
    public static void main(String args[]){
        sum_digits_2 ob=new sum_digits_2();
        System.out.println("answer : "+ob.sum_digits(1234));
    }
}
