public class pro1{ 
    public static void main(String[] args) {
        String str="hello";
        System.out.println(str);
        int i=0 , count=0 ;
        while (str.charAt(i)!='\0') {
            count++;
            i++;
        }
        System.out.println("lenght : "+count);
    }
}