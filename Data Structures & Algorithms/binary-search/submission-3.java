class Solution {
    public int search(int[] nums, int target) {
        // [-1,0,2,4,6,8] t = 3
        //  p1   m     p2
        // [4,6,8] t = 3
        // p1 m p2
        // [4] t = 3
        // p1 == p2 == m

        //start with the whole array
        int start = 0;
        int end = nums.length - 1;
        int mid = -1;

        // repeat until start == end
        while(start <= end) {
            // find the midpoint
            mid = start + (end - start) / 2; // auto floor because integers

            // check if the target is higher or lower than the mid value
            // if higher/lower take only the portion of the array above/below
            if(target > nums[mid]){
                start = mid + 1;
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        
        return -1;
    }
}
