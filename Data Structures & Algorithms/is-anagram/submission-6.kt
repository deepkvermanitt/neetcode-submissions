class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length!=t.length){
            return false
        }
        val arr = IntArray(26)
        for(i in s.indices){
            arr[s[i]-'a']+=1
            arr[t[i]-'a']-=1
        }
        for(j in arr){
            if(j != 0){
                return false
            }
        }
        return true
    }    
}
