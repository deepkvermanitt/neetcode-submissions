class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
         char[] charS =  s.toCharArray();
         char[] charT =  t.toCharArray();        
         int[] charIndexArr = new int[26];        
         for(int i =0 ;i<s.length();i++){
             charIndexArr[charS[i]-'a']+=1;
             charIndexArr[charT[i]-'a']-=1;
         }
          for(int i  : charIndexArr){
             if(i>0){
                return false;
             }
         }
        return true;
    }
}