class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> numFrequesncyMap = new HashMap<Integer,Integer>();
        Map<Integer,List<Integer>> frequesncyNumMap = new HashMap<Integer,List<Integer>>();
        int length = nums.length;
       int[] topKElement = new int[k];
       for(int i =0 ; i < length;i++){
        numFrequesncyMap.put(nums[i],numFrequesncyMap.getOrDefault(nums[i],0)+1);
       }
       for(int key : numFrequesncyMap.keySet()){
          List<Integer> arr =  frequesncyNumMap.getOrDefault(numFrequesncyMap.get(key),new ArrayList()); 
            arr.add(key);
            frequesncyNumMap.put(numFrequesncyMap.get(key),arr);
       }
        int kthIndex = 0;
        for(int j = length ; j>0;j--){
            List<Integer> numms = frequesncyNumMap.get(j) ;
            if(numms!= null && numms.size()>0){
                for(int n : numms){
                topKElement[kthIndex++]=n;
                if(kthIndex ==k){
                return topKElement;
                }
                }
            }
            

        }
        return topKElement;
    }
}
