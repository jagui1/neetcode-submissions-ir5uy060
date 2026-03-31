class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> seen = new HashMap();

        for(String str : strs){
            int[] count = new int[26];
            
            for(char chr : str.toCharArray()){
                count[chr - 'a']++;
            }

            String key = Arrays.toString(count);
            seen.putIfAbsent(key, new ArrayList<>());
            seen.get(key).add(str);
        }

        return new ArrayList<>(seen.values());   
    }
}
