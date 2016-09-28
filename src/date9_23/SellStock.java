package date9_23;

/**
 * Created by I334189 on 9/28/2016.
 */
public class SellStock {

    /*
    * one transactions
    * */
     public int maxProfit(int[] prices) {
        if(prices.length<=0)
            return 0;
         int min = prices[0];
         int maxProfit = 0;
         for(int i = 0;i < prices.length;i++){
             maxProfit = Math.max(maxProfit, prices[i] - min);
             min = Math.min(prices[i], min);
         }
         return maxProfit;
    }
    /*
     * as many as want transactions
     * */
    public int maxProfitii(int[] prices){
        if(prices.length <= 0)
            return prices[0];
        int maxProfit = 0;
        for(int i = 1;i < prices.length;i++){
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return  maxProfit;
    }
    /*
    * two transactions
    * */
    public int maxProfitiii(int[] prices){
        if(prices == null || prices.length < 2)
            return 0;
        int[] left = new int[prices.length];
        int[] right= new int[prices.length];

        //dp before day i
        int minBefore = prices[0];
        left[0] = 0;
        for(int i = 1;i < prices.length;i++){
            minBefore = Math.min(minBefore, prices[i]);
            left[i] = Math.max(left[i-1], prices[i] - minBefore);
        }
        //dp after day i
        int maxAfter = prices[prices.length-1];
        right[prices.length-1] = 0;
        for(int i = prices.length-2;i >= 0;i--){
            maxAfter = Math.min(maxAfter, prices[i]);
            right[i] = Math.max(right[i+1], maxAfter - prices[i]);
        }

        int maxProfit = 0;
        for(int i = 0;i < left.length;i++){
            maxProfit = Math.max(maxProfit, left[i] + right[i]);
        }
        return maxProfit;
    }
    /*
    * k transactions
    * */

    public int maxProfitiv(int k, int prices[]){
        return 0;
    }

    public static void main(String[] args){
        SellStock ss = new SellStock();
        int[] price = {7, 1, 5, 3, 6, 4};
        System.out.print(ss.maxProfit(price));
    }
}
