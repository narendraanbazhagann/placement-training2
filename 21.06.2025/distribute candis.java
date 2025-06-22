import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> uniqueTypes = new HashSet<>();

        for (int candy : candyType) {
            uniqueTypes.add(candy);
        }

        // Max different types Alice can eat is min(unique types, n / 2)
        return Math.min(uniqueTypes.size(), candyType.length / 2);
    }
}
