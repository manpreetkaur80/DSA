public class substr_1to1 {
    public static void main(String [] args)
    {
        String str="00101001";
    
        int count=0;
        for(int i=0 ; i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                for(int j=i+1;j<str.length();j++)
                {
                    if(str.charAt(j)=='1')
                    {
                        count++;
                        System.out.println("Substring from index "+i+" to "+j+" is: "+str.substring(i,j+1));
                    }
                }
            }
        }
        System.out.println("Total number of substrings with all 1s: "+count);
    }
}
