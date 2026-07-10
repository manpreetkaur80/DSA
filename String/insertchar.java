public class insertchar{
    public static void main(String[] args) {
        String str="hello";
        
        char c='Q';
        int in=3;
        String res = str.substring(0, in) + c + str.substring(in);
        System.out.println(res);
    }
}