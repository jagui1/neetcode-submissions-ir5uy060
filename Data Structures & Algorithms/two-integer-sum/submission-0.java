class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force: try every combo until we get it since we know it is possible
        
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++) {
                if(j != i && (nums[i] + nums[j]) == target){
                    return new int[]{i,j};
                }
            }
        }

        // will never reach if there is always a value
        return null;
    }
}
