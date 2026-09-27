class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[][]= new int[nums.length][2];
        int i=0;
        int j = nums.length-1;
        for(int k=0;k<nums.length;k++){
            arr[k][0] = nums[k];
            arr[k][1] = k;
        }
        Arrays.sort(arr, Comparator.comparingInt(a->a[0]));
        while(i<j)
        {
            int res = arr[i][0] + arr[j][0];
            if(res==target)
                return new int[]{Math.min(arr[i][1],arr[j][1]),Math.max(arr[i][1],arr[j][1])};
            else if (res<target)
                i++;
            else j--;
            
        }
        return new int[]{-1,-1};

        
    }
}
