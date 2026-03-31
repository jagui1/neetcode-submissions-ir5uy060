class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force: try every combo until we get it since we know it is possible
        // time complexity: n^2 | space complexity: 0 

        // optimized: map every index to the value and check if the difference of the 
        //            target and current number is in the map. it will always be true 
        //            by the second number since we are guaranteed a solution
        // time: n | space: n
        
        HashMap<Integer, Integer> seen = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int diff = target - nums[i];

            if(seen.containsKey(diff)){
                return new int[]{seen.get(diff), i};
            } else {
                seen.put(nums[i], i);
            }
        }

        // will never reach if there is always a value
        return null;
    }
}
