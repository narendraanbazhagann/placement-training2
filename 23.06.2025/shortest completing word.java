
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] requiredCounts = new int[26];
        
        // Count letters in licensePlate
        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                requiredCounts[Character.toLowerCase(c) - 'a']++;
            }
        }
        
        String result = null;
        
        for (String word : words) {
            if (isCompletingWord(word, requiredCounts)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }
        
        return result;
    }
    
    private boolean isCompletingWord(String word, int[] requiredCounts) {
        int[] wordCounts = new int[26];
        
        for (char c : word.toCharArray()) {
            wordCounts[Character.toLowerCase(c) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (wordCounts[i] < requiredCounts[i]) {
                return false;
            }
        }
        
        return true;
    }
}
