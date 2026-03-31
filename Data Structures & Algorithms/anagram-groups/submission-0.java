class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();

        // loop through every string
        for(String original:strs){
            // sort for the key to group the strings
            char[] chars = original.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // each key wil have a list of anagrams
            anagrams.computeIfAbsent(sorted, k -> new ArrayList<>()).add(original);
        }

        // the values automatically groups them together
        return new ArrayList<>(anagrams.values());
    }
}
