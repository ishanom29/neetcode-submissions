class Solution {
    public int[] singleNumber(int[] nums) {
                     int x=nums[0];
        for(int i=1;i<nums.length;i++)
            x=x^nums[i];   
            System.out.println(x);     
            int k= x&(~(x-1));
            System.out.println(k);
            int res1=0,res2=0;
            for(int i=0;i<nums.length;i++){
                if((k&nums[i])==0)
                   { System.out.println("res1 "+res1);
                    res1= res1^nums[i];}
                else
                {System.out.println("res2 "+res2);
                res2= res2^nums[i];}
            }
            return new int[]{res1,res2};
    }
}