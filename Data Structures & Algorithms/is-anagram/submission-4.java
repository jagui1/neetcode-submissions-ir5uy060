class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0) + 1);
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0) + 1);
        }

        for(Character key : sCount.keySet()) {
            if(!Objects.equals(sCount.get(key), tCount.get(key))){
                return false;
            }
        }

        return true;
    }
}
