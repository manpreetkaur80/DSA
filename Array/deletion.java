
import java.util.Scanner;   
public class deletion {
    static void biginning(int arr[], int size)
    {
        for(int i=0;i<size-1;i++)
        {
            arr[i]=arr[i+1];
        }
        System.out.println("the array after deletion is:");
        for(int i=0;i<size-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void end(int arr[], int size)
    {
        System.out.println("the array after deletion is:");
        for(int i=0;i<size-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void pos(int arr[], int size)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position where you want to delete the number:");
        int pos = sc.nextInt();
        for(int i=pos-1;i<size-1;i++){
            
            arr[i]=arr[i+1];

        }
        System.out.println("the array after deletion is:");
        for(int i=0;i<size-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void FirstOcurrance(int arr[] , int size)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to delete:");
        int num = sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==num){
                for(int j=i;j<size-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }

        System.out.println("the array after deletion is:");
        for(int i=0;i<size-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void allOcurrance(int arr[] , int size)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to delete:");
        int num = sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==num){
                for(int j=i;j<size-1;j++){
                    arr[j]=arr[j+1];
                }
                i--;
                size--;
            }
        }

        System.out.println("the array after deletion is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of element you want to enter ");
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
       while(true)
       {
        System.err.println("tell me where to delete the element , 1 for biginning , 2 for end and 3 for any position, 4.first occurrence, 5.all occurrences, 6.exit");
       
        int value = sc.nextInt();
        switch (value) {
            case 1:
                biginning(arr,size);
                size--;
                break;
        
        case 2:
            {
                 end(arr,size);
                size--;
                break;
            }
        case 3:
            {
                    pos(arr,size);
                    size--;
                    break;
            }
        case 4:
            {
                FirstOcurrance(arr,size);
                size--;
                break;
            }
        case 5:
            {
                allOcurrance(arr,size);
                size--;
                break;
            }
        case 6:
            {
                System.exit(0);
                break;
            }
            default:
                 break;

    }
}

    }
}
