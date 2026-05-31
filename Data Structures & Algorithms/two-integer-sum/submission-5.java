class Solution {
    public int[] twoSum(int[] nums, int target) {
     int[] pairArr = new int[2];
     Map<Integer,Integer> numPairMap = new HashMap<Integer,Integer>();
     for(int i = 0 ; i < nums.length;i++){
          int pair = target - nums[i];
        if(!numPairMap.containsKey(pair)){
            numPairMap.put(nums[i],i);
     }else{
                pairArr[0] = numPairMap.get(pair);
                pairArr[1] = i;
                
                return pairArr;
     }
     }   
    
     return pairArr;
    }
}
