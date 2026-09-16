
class fibonacciSearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};
        int n=arr.length;
        int target=60;
        int fib1=0 , fib2=1 , fib3;
     
        do
            {
                fib3=fib1+fib2;
                fib1=fib2;
                fib2=fib3;
            }
            while(fib3<n);
        int offset=-1;
        int position;
        while(fib3>1)
            {
                position=offset+fib1;
                if(arr[position]==target)
                {
                    System.out.println("found");
                    break;
                }
                else if(arr[position]<target)
                {
                    offset=position;
                    fib3=fib2;
                    fib2=fib1;
                    fib1=fib3-fib2;
                }
                else if(arr[position]>target)
                {
                    fib3=fib1;
                    fib2=fib2-fib1;
                    fib1=fib3-fib2;                    
                }
                    
            }
            }
}