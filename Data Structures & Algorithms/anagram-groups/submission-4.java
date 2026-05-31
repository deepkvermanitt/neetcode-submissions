class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> outPut = new ArrayList<List<String>>();
        Map<String,List<String>> anagramMap = new HashMap<String,List<String>>();
        for(int i =0 ;i <strs.length;i++){
            String str = strs[i];
            char[] strChar = str.toCharArray();
            StringBuilder hash= new StringBuilder();
           
            int[] charArrFreq = new int[26];
            char[] charArr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z'};
            for(char c:strChar){
                charArrFreq[c-'a']+=1;
            }
            for(char c:charArr){
                if( charArrFreq[c-'a']>0){
                    hash.append(c);
                    hash.append("|"+ charArrFreq[c-'a']);
                }
              
                            }
        
            List<String> stringList = anagramMap.getOrDefault(hash.toString(),new ArrayList<String>());
            stringList.add(str);
            anagramMap.put(hash.toString(),stringList);
        }
        for(List<String> listString: anagramMap.values()){
            outPut.add(listString);
        }
        return outPut;
    }
}
