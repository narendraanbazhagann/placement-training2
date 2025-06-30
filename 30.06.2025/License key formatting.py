class Solution:
    def licenseKeyFormatting(self, s, k):
        s = s.replace("-", "").upper()  # Remove dashes and convert to uppercase
        result = []
        
        first_group_len = len(s) % k or k  # Length of the first group
        
        result.append(s[:first_group_len])
        
        for i in range(first_group_len, len(s), k):
            result.append(s[i:i+k])
        
        return "-".join(result)
