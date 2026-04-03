class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numSet = set(nums)
        longestSequence = 0

        for num in numSet:
            if num - 1 not in numSet:
                i = num
                sequence = 1
                while i + 1 in numSet:
                    i += 1
                    sequence += 1
                if sequence > longestSequence:
                    longestSequence = sequence

        return longestSequence