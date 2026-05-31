class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==1){
            return nums;
        }
        Map<Integer,Integer> freqMap = new HashMap();
        for(int number : nums){
            freqMap.put(number,freqMap.getOrDefault(number,0)+1);
        }
        int arrayLength = nums.length;
        List<Integer>[] freqBucket = new List[arrayLength+1];
        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            int number = entry.getKey();
            int freq = entry.getValue();
             List<Integer> sameFreqList  = freqBucket[freq];
             if(sameFreqList == null){
                sameFreqList = new ArrayList();
             }
             sameFreqList.add(number);
             freqBucket[freq] = sameFreqList;
        }

        int[] outPut = new int[k];
         int index = 0;
       for(int i = arrayLength ; i >0 && index <k;i--){
          List<Integer> fList = freqBucket[i];
          if(fList!= null ){
          for(Integer freqnumber:fList ){
            outPut[index++] = freqnumber;
          }}
       }
    return outPut;
    }
}
