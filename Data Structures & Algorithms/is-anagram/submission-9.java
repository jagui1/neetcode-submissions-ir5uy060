class Solution {
    public boolean isAnagram(String s, String t) {
        // only can be anagrams if they are the same length
        if(s.length() != t.length()) {
            return false;
        }
        
        // counts the chars with position in the array representing the letter
        int[] count = new int[26];

        // count the letters for both strings
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int num: count){
            if(num != 0) return false;
        }

        return true;
    }
}
