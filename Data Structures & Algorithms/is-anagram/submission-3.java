class Solution {
    public boolean isAnagram(String s, String t) {
        //could loop through both at the same time and add to a hash map but would add a lot of space -> nvm since theres limited characters
        HashMap<String, Integer> sCount = new HashMap<>();
        HashMap<String, Integer> tCount = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(String let:s.split("")){
            if(sCount.containsKey(let)){
                sCount.put(let, sCount.get(let) + 1);
            } else {
                sCount.put(let, 1);
            }
        }

        for(String let:t.split("")){
            if(tCount.containsKey(let)){
                tCount.put(let, tCount.get(let) + 1);
            } else {
                tCount.put(let, 1);
            }
        }

        for(String key : sCount.keySet()) {
            if(!Objects.equals(sCount.get(key), tCount.get(key))){
                return false;
            }
        }

        return true;
    }
}
