class Solution:
    def swap(self,nums, i ,j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp


    def removeDuplicates(self, nums: List[int]) -> int:
        i,j =0,1;
        while j<len(nums):
            if nums[i]!=nums[j]:
                self.swap(nums,i+1,j)
                i=i+1;
            j=j+1;

        return i+1; 
        
        
        