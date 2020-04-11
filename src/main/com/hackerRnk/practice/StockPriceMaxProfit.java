package main.com.hackerRnk.practice;

/**
 * Given an array of stock price at start of the day. Find maximum profit can be made by buying
 * and selling the stock.
 */
public class StockPriceMaxProfit {

    static int maximumProfit (int[] prices){

        int maxProfit = Integer.MIN_VALUE;
        int lowPrice = Integer.MAX_VALUE;

        if(prices.length<1) return 0;

        for(int i=0;i<prices.length;i++){

            lowPrice = Math.min(prices[i], lowPrice);

            maxProfit = Math.max(maxProfit, prices[i]-lowPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[] {7,1,5,3,3,10};

        System.out.println("Max Profit is : "+maximumProfit(prices));
    }
}
