class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numSet = set(nums)
        longestSequence = 0

        for num in numSet:
            # check if it's possible to start a sequence
            if num - 1 not in numSet:
                sequence = 1
                # check for numbers until you can't continue the sequence
                while num + sequence in numSet:
                    sequence += 1

                longestSequence = max(sequence, longestSequence)

        return longestSequence