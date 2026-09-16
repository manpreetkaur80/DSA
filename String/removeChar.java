import java.util.Scanner;

public class removeChar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("Enter the position to be removed");
        int pos=sc.nextInt();
        StringBuilder str1=new StringBuilder(str);
        str1.deleteCharAt(pos);
        System.out.println("String after removing character at position "+pos+" is: "+str1
);  

    }
}