// Problem 2: Best Time to Buy and sell stock

// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

//APPORACH:
//Best way to approach this question is by using Kadane's apporach here 
//In stock we are checking purchasing_value(min_price) and profit_value value

//T.C : O(n) -> This algorithm iterates through array once i.e., until length of arrayy
//S.C : O(1) -> profit is only a constant value so constant amount of extra space has been utilised

//Solution

class problem2 {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i =1;i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }else if(prices[i] - buy > profit){
                
                profit = prices[i] - buy;
            }
        }
        return profit;

     }
}