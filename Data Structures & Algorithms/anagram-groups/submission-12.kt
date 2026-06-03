class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = mutableMapOf<String, MutableList<String>>()
    
    for (str in strs) {
        val key = str.toCharArray().sorted().joinToString("")
        if (!map.containsKey(key)) {
            map[key] = mutableListOf()
        }
        map[key]?.let{it.add(str)}
    }
    
    return map.values.toList()
}
}
