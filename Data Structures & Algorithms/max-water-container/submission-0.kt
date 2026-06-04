class Solution {
    fun maxArea(heights: IntArray): Int {
      var start = 0
      var end = heights.size-1
      var maxVolume =0

      while(start<end){
        var volume = Math.min(heights[start],heights[end])*(end-start)
        maxVolume = Math.max(volume,maxVolume)
        if(heights[start]<heights[end]){
            start++
        }else{
            end--
        }
      }
      return maxVolume
    }
}
