class Solution {
    public int maxProfit(int[] prices) {
        
        int buyDay=-1, buyPrice=-1, max=0, min =0,buy=0,profit=0;
        int i,j;

        for (i=0;i<prices.length-1;i++)
        {
            if(prices[i]<prices[i+1])
            {
                if(buy==0)
                {
                    buy=1;
                    buyPrice=prices[i];
                    buyDay=i;
                }
                if(buy==1)
                {
                    continue;
                }

            }
            if(prices[i]>prices[i+1] )
            {
                if(buy==1)
                {
                    buy=0;
                    profit += prices[i]-buyPrice;
                    
                }
            }
        }
        if(prices[i]>=prices[prices.length-1])
        {
            if(buy==1)
            {
                buy=0;
                 profit += prices[i]-buyPrice;
            }
        }
        return profit;

    }
}
