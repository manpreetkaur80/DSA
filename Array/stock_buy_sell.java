import java.util.Scanner;

public class stock_buy_sell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price :arr)
        {
            if(price <minprice)
            {
                minprice=price;
            }
            int profit=price-minprice;
            if(profit>maxprofit)
            {
                maxprofit=profit;
            }
        }
        System.out.print("minprice : "+minprice+"maxprofit : "+maxprofit);
    }
}
