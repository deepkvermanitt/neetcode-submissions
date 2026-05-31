class Solution {

    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Boolean> numExistMap = new HashMap<Integer,Boolean>();
        for(int i = 0 ; i < nums.length;i++){
            if(numExistMap.get(nums[i])==null || !numExistMap.get(nums[i])){
                numExistMap.put(nums[i],true);
            }else{
                return true;
            }
        }
        return false;
    }
}
