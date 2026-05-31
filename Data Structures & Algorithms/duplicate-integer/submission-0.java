class Solution {
    public boolean hasDuplicate(int[] nums) {
 Map<Integer,Integer> numMap = new HashMap<Integer,Integer>();
 for(int num:nums){
    if(numMap.get(num)==null){
        numMap.put(num,num);
    }else{
        return true;
    }
 }
    return false;
    }
}
