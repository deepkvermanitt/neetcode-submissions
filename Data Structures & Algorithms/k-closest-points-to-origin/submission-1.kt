class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        val minHeap = PriorityQueue<IntArray>(compareBy{it[0]*it[0]+it[1]*it[1]})

        for(point in points){
            minHeap.add(point)
        }
        
         val result = Array(k) { IntArray(2) }

        for(i in 0 until k){
            result[i] = minHeap.poll()
            
        }
        return result
    }
}
