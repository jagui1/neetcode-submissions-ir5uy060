class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        # pointers at the beginning of each string
        sp, tp = 0, 0

        # loop until a pointer reaches the end of a string
        while sp < len(s) and tp < len(t):
            # if there is a match you don't need to add it increment both
            if s[sp] == t[tp]:
                sp += 1
                tp += 1
            # if not keep searching s string to find the char in t
            else:
                sp += 1
            
        # if s reached the end you must add the rest of t
        if sp == len(s):
            return len(t[tp:])
        # t reached the end so all chars are in s
        else:
            return 0