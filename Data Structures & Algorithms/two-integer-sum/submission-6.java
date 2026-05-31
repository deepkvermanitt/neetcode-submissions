class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numPairMap = new HashMap<Integer,Integer>();
       int[] ouptPut = new int[2];
        for(int i = 0 ; i < nums.length;i++){
            int comp = target - nums[i];
            if(numPairMap.containsKey(comp)){
                ouptPut[1]=i;
                ouptPut[0]=numPairMap.get(comp);
                return ouptPut;
            }else{
                numPairMap.put(nums[i],i);
            }
        }
         return ouptPut;
    }
}
