class Solution {
    public boolean hasDuplicate(int[] nums) {
        //HashSet<Integer> h = new HashSet<Integer>();
        Arrays.sort(nums);
        int index= 0;
        for(int i =1;i<nums.length;i++){
            if(nums[index]!=nums[i])
            {
                index++;
            }
            else
            return true;
        }
        return false;

        
    }
}