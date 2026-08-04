public class kthnonrepeatStr {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        int k=3;
        int count=0;
        for(int i= 0; i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    break;
                }
                if(j==str.length()-1)

                    {
                        count++;
                        if(count ==k)
                        {
                            System.out.println(str.charAt(i));
                            break;
                        }
                    }
            }
        }
    }
}
