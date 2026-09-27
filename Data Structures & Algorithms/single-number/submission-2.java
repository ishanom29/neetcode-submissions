class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int k= nums[0];
        for(int i=0;i<nums.length-1;){
            if(nums[i+1]==nums[i])
            i=i+2;
            else return nums[i];

        }
        return nums[nums.length-1];
        
    }
}
