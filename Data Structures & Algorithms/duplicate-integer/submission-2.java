class Solution {
    public boolean hasDuplicate(int[] nums) {
        // count the amount of times each number appears using a hashmap
        // decide between set and map -> map easier to expand to other problems set makes more sense for this problem
        // if you have already seen the number then return false
        // if you get all the way through then there are no duplicates

        HashSet<Integer> count = new HashSet<>();

        for(Integer num : nums){
            if(count.contains(num)){
                return true;
            } else {
                count.add(num);
            }
        }
        
        return false;
    }
}