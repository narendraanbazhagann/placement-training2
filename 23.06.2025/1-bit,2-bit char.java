class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        
        while (i < bits.length - 1) {
            if (bits[i] == 1) {
                i += 2; // Two-bit character
            } else {
                i += 1; // One-bit character
            }
        }
        
        return i == bits.length - 1;
    }
}
