// public class rotateStr {
//     public static void main(String[] args) {
//         // String str="hello";
//         int d=2;
//         char[] str={'h','e','l','l','o'};
//         char[] res=new char[str.length];
//         // StringBuilder res=new StringBuilder();
//         for(int i=0 ; i<d;i++)
//         {
//             // str[str.length-1]=str[0];
//             char last=str[str.length-1];
//             for(int j=str.length-1; j>0 ;j--)
//             {
//                 str[j]=str[j-1];
//             }
//             str[0]=last;
//         }
//         System.out.println(str);

//     }
// }
     public class rotateStr {
    public static void main(String[] args) {
        char[] str = {'h','e','l','l','o'};
        int d = 2;
        int n = str.length;
        char[] res = new char[n];

        for (int i = 0; i < n; i++) {
            res[(i + d) % n] = str[i];
        }

        System.out.println(new String(res));
    }
}
