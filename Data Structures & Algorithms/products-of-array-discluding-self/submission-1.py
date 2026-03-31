class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # brute force time: n^2 space: 1
        # loop through each item in the array
        # for each item in the array loop the remaining numbers and multiply them
        # store the result in a new array
        newNums = []
        for i in range(len(nums)):
            product = 1

            for j in range(len(nums)):
                if i != j:
                    product *= nums[j]

            newNums.append(product)
            product = 0

        return newNums