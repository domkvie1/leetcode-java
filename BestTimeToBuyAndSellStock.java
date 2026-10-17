import java.util.*;

public class BestTimeToBuyAndSellStock{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Boolean run = true;
        while(run){
            System.out.println("How many days?");
            int days = sc.nextInt();
            int[] prices = new int[days];
            System.out.println("Give me a stock price for each day:");
            for(int i = 0; i < days; i++){
                prices[i] = sc.nextInt();
            }
            System.out.println("One Pass: Most profit possible: " + maxProfitOnePass(prices));
            System.out.println("Nested: Most profit possible: " + maxProfitNested(prices));
            System.out.println("Would you like to try with new prices? (Yes/No)");
            if(sc.next().equalsIgnoreCase("no")) run = false;
            
        }
        System.out.println("Have a great day! :)");
    }
    public static int maxProfitOnePass(int[] prices){
        int minPrice = prices[0];
        int bestProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] - minPrice > bestProfit){
                bestProfit = prices[i] - minPrice;
            }
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
        }
        return bestProfit;
    }

    public static int maxProfitNested(int[] prices){
        int bestProfit = 0;
        for(int i = 0; i < prices.length-1; i++){
            int price1 = prices[i];
            for(int j = i+1; j < prices.length; j++){
                int price2 = prices[j];
                int profit = price2 - price1; 
                if(profit > bestProfit) bestProfit = profit;
                
            }
        }
        return bestProfit;
    }
}
