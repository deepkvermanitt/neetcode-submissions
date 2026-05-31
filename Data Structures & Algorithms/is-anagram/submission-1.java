class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length()!= t.length())
         {
            return false;
         }
    int[] charArr = new int[28];
    char[] charS = s.toCharArray();
    char[] charT = t.toCharArray();

    for(char a:charS){
        charArr[a-'a']++;
    }
    for(char a:charT){
        charArr[a-'a']--;
    }
    for(int a:charArr){
       if(a>0){
        return false;
       }
    }
 return true;
}
}