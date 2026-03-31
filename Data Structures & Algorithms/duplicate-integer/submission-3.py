class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = {}
        # loop
        for num in nums:
            #num = 1
            if num in seen.keys():
                return True
            else:
                seen[num] = 0

        return False