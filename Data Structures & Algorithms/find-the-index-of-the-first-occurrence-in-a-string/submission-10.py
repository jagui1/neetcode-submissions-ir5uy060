class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        # if needle == haystack:
        #     return 0
        
        # if haystack[-1] == needle:
        #     return len(haystack) - 1


        for i in range(len(haystack)):
            p1, p2 = i, 0

            while p1 < len(haystack):
                if p2 == len(needle):
                    return p1 - len(needle)
                
                if haystack[p1] == needle[p2]:
                    p1 += 1
                    p2 += 1
                else:
                    p1 += len(haystack)

            if p2 == len(needle):
                return p1 - len(needle)

        return -1