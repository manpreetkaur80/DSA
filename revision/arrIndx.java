public class arrIndx {
    public static void main(String[] args) {
        int arr[]={11,10,20,30};
        int ind[]={1,2,0,3};
        int temp[]=new int[arr.length];
        for(int i=0 ; i<arr.length;i++)
        {
            temp[ind[i]]=arr[i];
        }
        for(int i=0 ; i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
    }    
}
