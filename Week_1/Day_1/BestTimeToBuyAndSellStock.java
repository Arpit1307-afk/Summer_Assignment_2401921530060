public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxP=0,minEle=Integer.MAX_VALUE;;
        for(int i=0;i<n;i++)
        {
            if(prices[i]<minEle) minEle=prices[i];
            int profit=prices[i]-minEle;
            if(profit>maxP) maxP=profit;
        }
        return maxP;
    }
}
