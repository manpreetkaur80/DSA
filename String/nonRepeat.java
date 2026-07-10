// public class nonRepeat {

//     public static void main(String args[])
//     {
//         String str="haelohow";
//         int arr[]=new int[256];
//         for(int i=0 ; i<str.length();i++)
//         {
//             arr[str.charAt(i)]++;
            
//     }
//     for(int i=0 ; i<str.length();i++)
//         {
//             if(arr[str.charAt(i)]==1)
//             {
//                 System.out.println("First non repeating character is: "+str.charAt(i));
//                 break;
//             }  
//          }
//     }}p
public class nonRepeat {

    public static void main(String args[])
    {
        String str="haelohow";
        outer:
        for(int i=0 ; i<str.length();i++)
        {
            for(int j=i+1 ; j<str.length();j++)
            {
               if(str.charAt(i)==str.charAt(j))
                {
                    break;
                }
                if(j==str.length()-1)
                {
                    System.out.println("First non repeating character is: "+str.charAt(i));
                    break outer;
                }
            }
        }
    }}