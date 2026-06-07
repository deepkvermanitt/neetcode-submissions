class Solution {
    fun maxProfit(prices: IntArray): Int {
      var maxProfit =0
      var cp = prices[0]
      for(i in 1 until prices.size){
            val profit = prices[i]-cp
            maxProfit = maxOf(profit,maxProfit)
            if(prices[i]<cp){
                cp = prices[i]
            }
      }
      return maxProfit
    }
}
