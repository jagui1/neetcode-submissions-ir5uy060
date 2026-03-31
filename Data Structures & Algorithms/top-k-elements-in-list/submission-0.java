class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(Integer num: nums){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        List<Integer> sortedKeys = new ArrayList<>(frequency.keySet());

        Collections.sort(sortedKeys, (a, b) -> frequency.get(b) - frequency.get(a));

        int[] answer = new int[k];

        for(int i = 0; i < k; i++){
            answer[i] = sortedKeys.get(i);

        }

        return answer;
    }
}
