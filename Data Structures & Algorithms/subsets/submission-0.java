class Solution {
    public List<List<Integer>> subsets(int[] nums) {
                List<List<Integer>> l = new ArrayList<>();
        int n=nums.length;
        int p=1<<n;
        for(int i=0;i<p;i++){
            ArrayList<Integer> a= new ArrayList<>();
        for(int j=0;j<n;j++){
            if((i&(1<<j))!=0){
            a.add(nums[j]);
            }
        }
        l.add(a);
        }
        return l;
    }
}
