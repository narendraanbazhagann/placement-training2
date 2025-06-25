class Solution(object):
    def toGoatLatin(self, sentence):
        vowels = set('aeiouAEIOU')
        ans = []
        for i, w in enumerate(sentence.split(), 1):
            if w[0] in vowels:
                nw = w + 'ma'
            else:
                nw = w[1:] + w[0] + 'ma'
            ans.append(nw + 'a' * i)
        return ' '.join(ans)
