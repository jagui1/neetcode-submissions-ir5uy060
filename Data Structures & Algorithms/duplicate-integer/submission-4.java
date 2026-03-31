class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for(Integer num:nums){
            if(seen.contains(num)){
                return true;
            } else {
                seen.add(num);
            }
        }
        
        return false;
    }
}