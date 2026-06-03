class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val result  = mutableListOf<Int>()
           val map = mutableMapOf<Int,Int>()
           for(n in nums){
             map[n] = map.getOrDefault(n,0)+1
           }
            
            val bucket = Array(nums.size+1){mutableListOf<Int>()}

            for((num,freq) in map){
                bucket[freq].add(num)
            }
        for(i in bucket.size -1 downTo 1){
            for(num in bucket[i]){
                result.add(num)
                if(result.size==k){
                    return result.toIntArray()
                }
            }
        }
        return result.toIntArray()
    }
}
