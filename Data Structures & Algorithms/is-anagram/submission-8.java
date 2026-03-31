class Solution {
    public boolean isAnagram(String s, String t) {
        // only can be anagrams if they are the same length
        if(s.length() != t.length()) {
            return false;
        }
        
        // counts the chars with position in the array representing the letter
        int[] sCount = new int[26];
        int[] tCount = new int[26];

        // count the letters for both strings
        for(int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            tCount[t.charAt(i) - 'a']++;
        }

        // see if the counts are the same
        return Arrays.equals(sCount, tCount);

    }
}
