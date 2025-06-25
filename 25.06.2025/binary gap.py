class Solution(object):
    def binaryGap(self, n):
        bin_n = bin(n)[2:]

        idx = -1
        max_d = -1
        cnt = 0

        for i, n in enumerate(bin_n):
            if n == '1' and idx == -1:
                idx = i
                cnt += 1
            elif n == '1':
                max_d = max(max_d, i - idx)
                idx = i
                cnt += 1

        return max_d if cnt > 1 else 0 


        
            
        
