class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
            var left =0
            var stringSet = HashSet<Char>()
            var maxLength=0
            for(i in s.indices){
                var right = s[i]
                if(!stringSet.contains(right)){
                    stringSet.add(right)
                    maxLength = Math.max(maxLength,stringSet.size)
                   
                }else{
                    while(stringSet.contains(right)){
                    stringSet.remove(s[left])
                    left++
                   }
                     stringSet.add(right)
                }
            }
            return maxLength
    }
}
