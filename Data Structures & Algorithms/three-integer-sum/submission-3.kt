class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
       val result = mutableListOf<List<Int>>()
       val n = nums.size
       nums.sort()
       for(i in nums.indices ){
        if (i > 0 && nums[i] == nums[i-1]) continue

        var start =i+1
        var end=n-1
       while(start<end){
        val sum = nums[i]+nums[start]+nums[end]
        when {
            sum ==0->{
            result.add(listOf<Int>(nums[i],nums[start],nums[end]))
            
            while(start<end && nums[start]==nums[start+1]) start++
            while(start<end && nums[end]==nums[end-1]) end--
            start++
            end--
            }
            sum<0->start++
            else-> end--
        }
        
       }
    }
     return result
     
}
}
