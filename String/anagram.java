import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String s1="geeks";
        String s2="eegks";
        char s1arr[]=s1.toCharArray();
        char s2arr[]=s2.toCharArray();
        Arrays.sort(s1arr);
        Arrays.sort(s2arr);
        if(Arrays.equals(s1arr, s2arr))
        {
            System.out.println("anagram strings");
        }
        else{
            System.out.println("not anagram strings");
        }
    }

}
