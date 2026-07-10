public class reverseStr {
    public static void main(String[] args) {
        String str="helloo";
        StringBuilder res=new StringBuilder();
        for(int i=str.length()-1; i>=0 ; i--)
        {
            res.append(str.charAt(i));
        }
        System.out.println(res);
    }
}
