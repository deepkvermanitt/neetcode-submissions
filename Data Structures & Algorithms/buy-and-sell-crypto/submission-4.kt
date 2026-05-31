class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minCp = prices[0]
        var maxProfit = 0
        for(sp in prices.drop(1)){
            var profit = sp -minCp
            maxProfit = Math.max(profit,maxProfit)
            minCp = Math.min(minCp,sp)
        }
        return maxProfit  
    }
}
