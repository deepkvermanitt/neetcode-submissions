class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
            val numComplacentHash = HashMap<Int,Int>()
            for(i in nums.indices){
                val comp = target-nums[i]
                if(numComplacentHash.contains(comp)){
                    return intArrayOf(numComplacentHash.get(comp)!!,i)
                }else{
                    numComplacentHash.put(nums[i],i)
                }
            }
            return intArrayOf()
    }
}
