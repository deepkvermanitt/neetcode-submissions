class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int,Int>()
        for(i in nums.indices){
            val comp = target - nums[i]
            if(map.contains(comp)){
                return intArrayOf(map[comp]!!,i)
            }else{
                map[nums[i]] =i
            }
        }
        return intArrayOf()
    }
}
