class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strss=sorted(strs)
        res = ""
        for i in range(len(strss[0])):
            for s in strss:
                if s[i]!=strss[0][i]:
                    return res
            res = res + strss[0][i]
        return res


        