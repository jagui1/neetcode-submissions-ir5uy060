class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # map of unique char count -> words that are anagrams
        anagrams = defaultdict(list)

        # loop through each word
        for s in strs:
            # initialize character array
            letters = [0]*26

            # count the characters
            for char in s:
                letters[ord('a') - ord(char)] += 1
            # add each word to the list of anagrams
            anagrams[tuple(letters)].append(s)

        # list of lists for the answer
        return list(anagrams.values())