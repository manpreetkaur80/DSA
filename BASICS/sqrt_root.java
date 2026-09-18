public class sqrt_root {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(floorSqrt(n));
    }
static int floorSqrt(int n) {
    
    // start iteration from 1 until the 
    // square of a number exceeds n
    int res = 1;
    while (res * res <= n) {
        res++;
    }
    
    // return the largest integer whose 
    // square is less than or equal to n
    return res-1;
}

}