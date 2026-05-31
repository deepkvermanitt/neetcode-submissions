class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> numMap = new HashMap<Integer,Integer>();
        for(Integer n : nums){
            if(numMap.getOrDefault(n,0)>0){
               return true; 
            }else{
                numMap.put(n,1);
            }
        }
         return false; 
    }
}