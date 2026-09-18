import java.util.*;
public class sum_digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();
        int sum = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
