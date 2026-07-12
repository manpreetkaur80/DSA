public class subsequence {
    public static void main(String[] args) {
        String s1="xyz";
        String s2="fxgydz";
    
        int i=0,j=0;
        while(i<s1.length()&&j<s2.length())
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                i++;  
            }
            j++; 
        
        }
        System.out.print(i==s1.length());
    }
}
