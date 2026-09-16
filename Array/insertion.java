import java.util.Scanner;

class insertion{
    static void end(int arr[], int size , int n)
    {
        arr[size]=n;
        System.out.println("the array after insertion is:");
        for(int i=0;i<=size;i++){
            System.out.println(arr[i]+" ");
        }
    }
    static void pos(int arr[], int size , int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position where you want to insert the number:");
        int pos = sc.nextInt();
        for(int i=size-1;i>=pos-1;i--){
            
            arr[i+1]=arr[i];

        }
       arr[pos-1]=n;
        System.out.println("the array after insertion is:");
        for(int i=0;i<=size;i++){
            System.out.println(arr[i]+" ");
        }
    }
    static void biginning(int arr[], int size , int n)
    {
        for(int i=size-1;i>=0 ;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=n;
        System.out.println("the array after insertion is:");
        for(int i=0;i<=size;i++){
            System.out.println(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]=  new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element you want to enter ");
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array is:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Enter the number you want to insert at biginning of the array:");
        int n = sc.nextInt();
        while(true)
        {
        System.err.println("tell me whee to enter the element , 1 for biginning , 2 for end and 3 for any position  , 4.exit");
        int value = sc.nextInt();
        switch (value) {
            case 1:
                biginning(arr,size,n);
                
                break;
            case 2:
                end(arr,size,n);
                break;
            case 3:
                pos(arr,size,n);
                break;
            case 4:
                System.exit(0);
                 break;
            default:
                break;
        }
    }
}
}