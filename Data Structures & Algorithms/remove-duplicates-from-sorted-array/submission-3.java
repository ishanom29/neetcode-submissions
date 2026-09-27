class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> treeSet =new TreeSet<Integer>();
        int idx= 0;
        for(int i : nums){
            if(treeSet.contains(i)==false){
                treeSet.add(i);
                nums[idx] =i;
                idx++;
                
            }
           
        }
         return idx;
    }
}