class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        if(l1!=l2){
            return false;
        }
        int[] charFreqArr = new int[26];
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for(int i = 0 ; i < l1;i++){
            charFreqArr[sChar[i]-'a']+=1;
            charFreqArr[tChar[i]-'a']-=1;
        }
          for(int i = 0 ; i < 26;i++){
            if(charFreqArr[i]>0){
                return false;
            }
          }
          return true;
    }
}
