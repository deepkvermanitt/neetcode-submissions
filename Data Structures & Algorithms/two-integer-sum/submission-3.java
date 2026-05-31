class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] outPut = new int[2];
        int lastIndex = nums.length;
        int startIndex = 0;
        int complement = 0;
        Map<Integer,Integer> mapNumIndex = new HashMap<Integer,Integer>();
         for(int i = 0 ; i < lastIndex;i++){
            mapNumIndex.put(nums[i],i);
         }
          for(int i = 0 ; i < lastIndex;i++){
            complement = target - nums[i];
            if(mapNumIndex.get(complement)!= null && i!=mapNumIndex.get(complement)){
                  outPut[0]=i;
                  outPut[1]=mapNumIndex.get(complement);
                  return outPut;
            } 
          }
              return outPut;
        }
       
    
}
