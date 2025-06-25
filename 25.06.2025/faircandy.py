class Solution(object):
    def fairCandySwap(self, a, b):
        val=(sum(a)-sum(b))//2
        for i in b:
            if i+val in a:
                return [i+val, i]
