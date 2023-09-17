public class StockBuySelll {
    public static void main(String[] args)
    {
        int[] strs = new int[]{3,3,5,0,0,3,1,4};

        System.out.println( maxProfit(strs));
    }

    public static int maxProfit(int[] prices) {

        int min = -1;
        int minIndex = 0;
        int profit = 0;
        for (int i =0; i< prices.length; i++)
        {
            if(prices[i]>min && min == -1){
                min = prices[i];
                minIndex = i;
            }
            if(min<prices[i] && min != -1){
                profit += prices[i] - min;
            }
        }


        return profit;
    }
}
