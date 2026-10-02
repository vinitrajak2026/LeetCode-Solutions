// We need to:buy at minimum price; sell later at maximum price ; return maximum profit
//keep minimum track and current profit=curr price-minimum_price  store maximum profit
class Solution 
{
    public int maxProfit(int[] prices)
     {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i< prices.length;i++)
        {
            
            if(prices[i]<minPrice){//minimum buying price
                minPrice=prices[i];
            }
            int profit=prices[i]-minPrice; //current profit
           
            if(profit>maxProfit){ //maximum profit
                maxProfit=profit;
            }
        }
        return maxProfit;       
    }
}