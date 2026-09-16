public class substring1to1 {
    public static void main(String[] args) {
        int count=0;
        String str="0100101";
        for(int i=0 ; i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                for(int j=i+1; j<str.length();j++)
                {
                        if(str.charAt(j)=='1')
                        {
                            count++;
                            System.out.println(str.substring(i,j+1));
                        }
                }
            }
        }
        System.out.println("total substring : "+count);
    }
}
