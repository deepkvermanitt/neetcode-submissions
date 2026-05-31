class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagramGroups = new ArrayList<List<String>>();
        boolean[] visited = new boolean[strs.length];
        for(int i =0; i < strs.length;i++){
            List<String> anagramString = new ArrayList();
           if(!visited[i]){
                       anagramString.add(strs[i]);
                       visited[i] =true;

           }else{
            continue;
           }
          

        for(int j =i; j < strs.length;j++){
            if(!visited[j] && isAnagram(strs[i],strs[j])){
                anagramString.add(strs[j]);
                 visited[j] =true;
                
            }
        }
         anagramGroups.add(anagramString);
       
    }
    return anagramGroups;
    }
    boolean isAnagram(String a,String b){
        if(a.length()!= b.length()){
            return false;
        }
        int[] charFreq = new int[26];
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        for(int i =0 ; i < a.length();i++){
            charFreq[aChar[i] -'a']+=1;
            charFreq[bChar[i]-'a']-=1;
        }
        for(int i =0 ; i < 26;i++) {
            if(charFreq[i]>0){
                return false;
            }
        }
        return true;
    }
    }
