public class pangramStr {
    public static void main(String[] args) {
        String str="abcdefghijklmqrstuvwxyz";
        int arr[]=new int[256];
        boolean ispangram=true;
        for(int i=0 ; i<str.length();i++)
        {
            
            if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                arr[str.charAt(i)]++;
            }
           
        }
      for(int i='a';i<='z';i++)
      {
        if(arr[i]==0)
        {
            ispangram=false;
            break;
        }
       
      }
       if(ispangram)
        {
            System.out.println("the string is panagram");
        }
        else if(!ispangram)
        {
            System.out.println("not panagram");
        }
    
    }
}
