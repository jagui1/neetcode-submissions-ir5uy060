class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {}

        # loop through each word
        for word in strs:
            # turn each word into a string that will be the same for each anagram
            letters = ''.join(sorted(word))

            # append the word if it shares the letters and add it if it's new
            if letters in anagrams:
                anagrams[letters].append(word)
            else:
                anagrams[letters] = [word]

        # turn dict into a list of lists of strings
        return list(anagrams.values())