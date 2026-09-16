import java.util.*;

public class remove_duplicate {
    public static void main(String[] args) {
        int arr[]=new int[10];
       ArrayList<Integer> result=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0 ;i<arr.length;i++)
        {
            if(!result.contains(arr[i]))
            {
                result.add(arr[i]);
            }
        }
        System.out.print("result : ");
        for(int element:result)
        {
            System.out.println(element);
        }
    }
}
