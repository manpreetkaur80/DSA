public class removeCharStr {
   public static void main(String[] args) {
    String str="hello";
    int i=2;
    StringBuilder str2=new StringBuilder(str);
    // str2.deleteCharAt(i);
    // System.out.println(str2);
   String str3=str.replace("l","");
    System.out.println(str3);
} 
}
