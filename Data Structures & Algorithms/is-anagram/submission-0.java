class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!= t.length()){
        return false;
    }
    int[] charArr = new int[26];
    char[] sChar = s.toCharArray();
    char[] tChar = t.toCharArray();
    for(int i = 0 ;i < sChar.length ; i++){
        charArr[sChar[i]-'a']+=1;
        charArr[tChar[i]-'a']-=1;
    }
    for(int j =0 ; j < 26;j++){
        if(charArr[j]>0){
            return false;
        }
    }
    return true;
    }
}
