public class stockBuySell {
    public static void main(String[] args) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        int arr[]={7,1,5,3,6,4};
for(int price:arr)
{
    if(price<minprice)
    {
        minprice=price;
    }
    int profit=price-minprice;
    if(profit>maxprofit)
    {
        maxprofit=profit;
    }

}
    System.out.println("max profit : "+maxprofit+"  buy : "+minprice+" sell  : "+(maxprofit+minprice));
    }
}
