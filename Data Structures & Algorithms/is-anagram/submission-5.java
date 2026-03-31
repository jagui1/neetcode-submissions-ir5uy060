class Solution {
    public boolean isAnagram(String s, String t) {
        // option 1: sort each string and compare each index time -> nlgn space -> 0
        // option 2: keep a count of the number of chars in each and compare the counts
        //           time -> n + m, space -> 26

        // hash map to keep the count
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        // cannot be an anagram if they are different lengths
        if(!(s.length() == t.length())) {
            return false;
        }

        // count each character
        for(int i=0; i<s.length(); i++) {
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0) + 1);
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0) + 1);
        }

        // compare the counts
        for(Character key: sCount.keySet()){
            if(!sCount.get(key).equals(tCount.get(key))) {
                return false;
            }
        }

        return true;
    }
}
