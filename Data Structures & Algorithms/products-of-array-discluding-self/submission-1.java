class Solution {
    // [1,2,3,4]
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[]output = new int[length];
        output[0]=1;
        for(int i = 1 ; i < length;i++){
            output[i] =output[i-1]* nums[i-1];
        }
        int suffix = 1;
        for(int j =  length-1 ; j >=0;j--){
            output[j] =suffix* output[j];
            suffix = suffix* nums[j];
        }
          
        return output;
    }
}  
