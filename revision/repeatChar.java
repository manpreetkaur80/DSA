// class repeatChar{
//     public static void main(String[] args) {
//         String str="hellow";
//         outer:
//         for(int i=0 ; i<str.length();i++)
//         {
//             char ch=str.charAt(i);
//             for(int j=i+1 ; j<str.length();j++)
//             {
//                 if(str.charAt(j)==ch)
//                 {
//                     System.out.println("character firdt repeatif=nng is : "+ch);
//                     break outer;
//                 }
//             }
//         }
//     }
// }
class repeatChar{
    public static void main(String[] args) {
        String str="hellow";
        int[] arr=new int[256];
        for(int i=0 ; i<str.length();i++)
        {
            arr[str.charAt(i)]++;
            if(arr[str.charAt(i)]>1)
            {
                System.out.println("first repating : "+str.charAt(i));
                break;
            }
        }
    }
}