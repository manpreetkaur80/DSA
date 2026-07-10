// public class rotation {
//   public static void main(String[] args) {
//     String str="hello";
//     String str2="hell";
//     int d=str.length();
//     boolean isequals=false;
//     StringBuilder str1=new StringBuilder(str);
//     for(int i=0 ; i<d;i++)
//     {
//         char last=str1.charAt(str1.length()-1);
//         for(int j=str.length()-1;j>0;j--)
//         {
//             str1.setCharAt(j,str1.charAt(j-1));
//         }
//         str1.setCharAt(0,last);
//         // System.out.println("String after rotation is: "+str1);
//         if(str1.toString().equals(str2))
//         {
//             isequals=true;
//             break;
//         }
        
//     }
//     if(isequals)
//     {
//         System.out.println("String "+str2+" is a rotation of string "+str);
//     }
//     else
//     {
//         System.out.println("String "+str2+" is not a rotation of string "+str);
//     }
    
//   }  
// }

public class rotation {
  public static void main(String[] args) {
    String str="hello";
    String str2="ohell";
    int d=str.length();
    boolean isequals=false;
    String str1=str;
    for(int i=0 ; i<d;i++)
    {
        char last=str1.charAt(str1.length()-1);
        str1=last+str1.substring(0,str1.length()-1);
        // System.out.println("String after rotation is: "+str1);
        if(str1.toString().equals(str2))
        {
            isequals=true;
            break;
        }
        
    }
    if(isequals)
    {
        System.out.println("String "+str2+" is a rotation of string "+str);
    }
    else
    {
        System.out.println("String "+str2+" is not a rotation of string "+str);
    }
    
  }  
}
