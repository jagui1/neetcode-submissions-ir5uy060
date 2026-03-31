class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Each character count mapped to the original string
        HashMap<String, List<String>> anagrams = new HashMap<>();
        // array to count the characters
        int[] count; 

        // loop for each string
        for(String s : strs) {
            // reset the count for each string
            count = new int[26];

            // count the chars in each string
            for(char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // map the thing
            anagrams.computeIfAbsent(Arrays.toString(count), k -> new ArrayList<String>()).add(s);
        }

        return new ArrayList<>(anagrams.values());        
    }
}
