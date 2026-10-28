class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count,res =1,nums[0]
        for i in range(1,len(nums)):
            if nums[i]==res:
                count+= 1;
            else:
                count-=1;
                if count==0:
                    count =1
                    res = nums[i]
        
        s=0
        for i in nums:
            if res==i:
                s+=1;
        if s>(len(nums)//2):
            return res
        return -1;
                    
            

        