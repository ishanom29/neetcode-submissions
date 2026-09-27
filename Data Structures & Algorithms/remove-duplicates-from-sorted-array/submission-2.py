class Solution:
    def swap(self,nums, i ,j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp


    def removeDuplicates(self, nums: List[int]) -> int:
        s= set()
        idx =0
        for i in range(len(nums)):
            if nums[i] not in s:
                s.add(nums[i])
                nums[idx] = nums[i]
                idx= idx+1
        return idx
            
        
        
        