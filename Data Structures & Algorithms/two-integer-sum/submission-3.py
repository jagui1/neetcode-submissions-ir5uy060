class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        i = 0

        while nums[i] not in seen:
            seen[(target - nums[i])] = i
            i += 1

        return [seen[nums[i]], i]