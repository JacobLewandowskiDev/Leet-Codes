package org.jakubLeetCodes;

public class StockMarket {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(bruteProfit(prices));
        System.out.println(profit(prices));
    }

    public static int bruteProfit(int[] prices) {
        int biggestProfit = 0;

        for(int i = 0; i< prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                if(prices[j] - prices[i] > biggestProfit) {
                    biggestProfit = prices[j] - prices[i];
                }
                if(prices[j] - prices[i] <= 0) {
                    i++;
                }
            }
        }
        return biggestProfit;
    }

    public static int profit(int[] prices) {
        int biggestProfit = 0;
        int lowestPrice = 0;

        for(int i = 0; i < prices.length; i++) {
            if(i == 0) {
                lowestPrice = prices[0];
            }
            if(prices[i] < lowestPrice) {
                lowestPrice = prices[i];
            }
            if(prices[i] - lowestPrice > biggestProfit) {
                biggestProfit = prices[i] - lowestPrice;
            }
            if(biggestProfit < 0) {
                biggestProfit = 0;
            }
        }
        return biggestProfit;
    }
}
