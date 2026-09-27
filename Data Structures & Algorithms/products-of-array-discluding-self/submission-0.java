class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==1) return nums;
      int pre[] = new int[nums.length];
      pre[0]=nums[0];
      for(int i=1;i<nums.length;i++){
        pre[i]=nums[i]*pre[i-1];
      }
      int pos[]=new int[nums.length];
      pos[nums.length-1]= nums[nums.length-1];
      for(int i=pre.length-2;i>=0;i--){
        pos[i]=pos[i+1]*nums[i];
      }  
      int output[]=new int[nums.length];
      output[0]=pos[1];
      output[nums.length-1]=pre[nums.length-2];
      for(int i=1;i<nums.length-1;i++){
        output[i]= pre[i-1]*pos[i+1];
      }
      return output;
    }
}  
