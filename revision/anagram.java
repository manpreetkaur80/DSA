
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1="geeks";
        String s2="eekgs";
        char s1arr[]=s1.toCharArray();
        char s2arr[]=s2.toCharArray();
        Arrays.sort(s1arr);
        Arrays.sort(s2arr);
        s1=new String(s1arr);
        s2=new String(s2arr);
        System.out.println(s1+" "+s2);
        if(s1.equals(s2))
        {
            System.out.println("anagram string");
        }
        else{
            System.out.println("not angram");
        }
    }
}
