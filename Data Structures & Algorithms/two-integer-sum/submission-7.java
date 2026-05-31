class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> complementMap = new HashMap();
        for(int i = 0;i<nums.length;i++){
            int comp = target -nums[i];
            if(complementMap.get(comp)!=null){
                return new int[]{complementMap.get(comp),i};
            }else{
                complementMap.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
