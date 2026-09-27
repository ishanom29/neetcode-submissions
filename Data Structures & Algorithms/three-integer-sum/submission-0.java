class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr= new ArrayList<>();
        if(nums[0]>0)
        return arr;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])
             continue;
            int res= nums[i]*-1;
            int a=i+1,b=nums.length-1;
            while(a<b){
                if(nums[a]+nums[b]==res)
                 {
                    List<Integer>l = new ArrayList<>();
                    l.addAll(Arrays.asList(nums[i],nums[a],nums[b]));
                    arr.add(l);
                    a++;
                    b--;
                    while(a<b && nums[a]==nums[a-1])
                    a++;

                    while(a<b && nums[b]==nums[b+1])
                    b--;
                 }
                 else if((nums[a]+nums[b]<res))
                    a++;
                else b--;

            }
        }
        return arr;
    }
}
