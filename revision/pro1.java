import java.util.Scanner;


        public class pro1{
    
    static void  insert(int[] arr,int n , int num){
        for(int i=n; i>=0;i--)
        {
            arr[i+1]=arr[i];
            
        }
        arr[0]=num;
        System.out.println("array after insertion");
        for(int i=0 ; i<=n ;i++)
        {
            System.out.println(arr[i]);
        }
}
static void end(int arr[],int n , int no)
{
    arr[n]=no;
     System.out.println("array after insertion");
        for(int i=0 ; i<=n ;i++)
        {
            System.out.println(arr[i]);
        }
    
}
static void pos(int arr[],int n , int no)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the position you want to add");
    int pos=sc.nextInt();
    for(int i=n-1 ; i>=pos-1 ;i--)
    {
        arr[i+1]=arr[i];
    }
    arr[pos-1]=no;
     System.out.println("array after insertion");
        for(int i=0 ; i<n ;i++)
        {
            System.out.println(arr[i]);
        }
}
static void delete(int arr[], int n,int num)
{
    for(int i=0 ; i<n-1;i++)
    {
        arr[i]=arr[i+1];
    }
        System.out.println("array after deletion");
        for(int i=0 ; i<n ;i++)
        {
            System.out.println(arr[i]);
        }
    
}  
static void deleteEnd(int arr[], int n , int no)
{
            System.out.println("array after deletion");
        for(int i=0 ; i<n-1 ;i++)
        {
            System.out.println(arr[i]);
        }
}
static void deleteFirstOcc(int arr[], int n , int no)
{
    for(int i=0 ; i<n ;i++)
    {
        if(arr[i]==no)
        {
            for(int j=i ; j<n ; j++)
            {
                arr[j]=arr[j+1];
            }
   
        break;
        }

   
    }
        System.out.println("array after deletion");
        for(int i=0 ; i<n ;i++)
        {
            System.out.println(arr[i]);
        }
}
static void deleteAllOcc(int arr[], int n , int no)
{
    for(int i=0 ; i<n ;i++)
    {
        if(arr[i]==no)
        {
            for(int j=i ; j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            i--;
            n--;
        }
    }
        System.out.println("array after deletion");
        for(int i=0 ; i<n ;i++)
        {
            System.out.println(arr[i]);
        }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[10];
    System.out.println("enter size : ");
    int n=sc.nextInt();
System.out.println("enter array element");
        for(int i=0;  i<n ;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element to insert");
        int no=sc.nextInt();
        while(true)
        {
            System.out.println("enter choice");
            System.out.println("1.Insert at first\n2.Insert at position\n3.insert at last\n4.deletefirst\n5.delete end \n6.deletefirstOccurance\n7.deleteall occurance\n8>exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    insert(arr,n,no);
                    break;
                case 2:
                    pos(arr,n,no);
                    break;
                case 3:
                    end(arr,n,no);
                    break;
                case 4:
                    delete(arr,n,no);
                    break;
                case 5:
                    deleteEnd(arr,n,no);
                    break;
                case 6:
                    deleteFirstOcc(arr,n,no);
                    break;
                case 7:
                    deleteAllOcc(arr,n,no);
                    break;
                case 8:
                    return;
                default:
                    break;
            }
        }
}
}