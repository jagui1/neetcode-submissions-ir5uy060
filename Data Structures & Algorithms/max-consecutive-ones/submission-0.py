class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        streak = 0
        mx = 0

        for num in nums:
            if num == 1:
                streak += 1
            else:
                mx = max(mx, streak)
                streak = 0

        return max(mx, streak)