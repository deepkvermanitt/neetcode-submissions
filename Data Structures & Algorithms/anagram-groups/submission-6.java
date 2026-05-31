class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groupAnagramsMap = new HashMap();
        for(String s:strs){
            char[] sCharArr = s.toCharArray();
            Arrays.sort(sCharArr);
            String sortedString = new String(sCharArr);
            List<String> anagrmList = groupAnagramsMap.getOrDefault(sortedString,new ArrayList());
            anagrmList.add(s);
            groupAnagramsMap.put(sortedString,anagrmList);
        }
        return new ArrayList(groupAnagramsMap.values());
    }
}
