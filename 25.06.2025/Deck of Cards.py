class Solution(object):
    def hasGroupsSizeX(self, deck):
        count = Counter(deck)
        min_count = min(count.values())
        
        for i in range(2, min_count + 1):
            if all(c % i == 0 for c in count.values()):
                return True
        return False
