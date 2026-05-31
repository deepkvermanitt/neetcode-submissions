

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] outPut = new int[k];
        Map<Integer, Integer> numFrequencyMap = new HashMap<>();
        
        // Step 1: Count the frequency of each number
        for (int num : nums) {
            numFrequencyMap.put(num, numFrequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Create buckets where index represents frequency
        List<Integer>[] numFrequencyArr = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : numFrequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (numFrequencyArr[frequency] == null) {
                numFrequencyArr[frequency] = new ArrayList<>();
            }
            numFrequencyArr[frequency].add(entry.getKey());
        }
        
        // Step 3: Collect the top K frequent elements
        int outPutLen = 0;
        for (int i = nums.length; i >= 0 && outPutLen < k; i--) {
            if (numFrequencyArr[i] != null) {
                for (int num : numFrequencyArr[i]) {
                    if (outPutLen < k) {
                        outPut[outPutLen++] = num;
                    } else {
                        break;
                    }
                }
            }
        }
        
        return outPut;
    }
}
