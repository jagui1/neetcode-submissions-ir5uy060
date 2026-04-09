class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        # pointers at the beginning and end of array
        p1, p2 = 0, len(numbers) - 1
        # original sum the first + the last number
        curSum = numbers[p1] + numbers[p2]

        # loop until answer is found
        while curSum != target:
            # move second pointer to lower and the first to raise the sum
            if curSum > target:
                p2 -= 1
            else:
                p1 += 1
            # recalculate
            curSum = numbers[p1] + numbers[p2]

        # 1 indexes the result
        return [p1 + 1, p2 + 1]