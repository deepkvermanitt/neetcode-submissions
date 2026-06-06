class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var sum = 0
        var maxSum =  nums[0]

        for(i in  nums.indices){
            sum+=nums[i]
            maxSum = maxOf(maxSum,sum)
            if(sum<0){
                sum = 0
            }

        }

        return maxSum
    }
}
