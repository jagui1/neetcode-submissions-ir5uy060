class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force -> compare every combination of numbers to find the answer Time: O(n^2) Space O(1)

        // Time: O(n) Space: O(n)

        // loop through each number and store the number that number needs to reach the target then once we reach the other number we will have it
        // store the value needed to reach the target and the index of the first number
        HashMap<Integer, Integer> seen = new HashMap<>();
        int cur = 0;
        while(!seen.containsKey(nums[cur])){
            seen.put(target - nums[cur], cur);
            cur += 1;
        }

        return new int[]{seen.get(nums[cur]).intValue(), cur};
        
    }
}
