import java.util.*;

class MyHashMap {

    private final int SIZE = 1000;
    private List<Pair>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        
        if (buckets[index] == null)
            buckets[index] = new LinkedList<>();
        
        for (Pair pair : buckets[index]) {
            if (pair.key == key) {
                pair.value = value; // Update existing key
                return;
            }
        }
        
        buckets[index].add(new Pair(key, value)); // Add new key-value pair
    }

    public int get(int key) {
        int index = hash(key);
        
        if (buckets[index] != null) {
            for (Pair pair : buckets[index]) {
                if (pair.key == key)
                    return pair.value;
            }
        }
        
        return -1; // Key not found
    }

    public void remove(int key) {
        int index = hash(key);
        
        if (buckets[index] != null) {
            Iterator<Pair> iterator = buckets[index].iterator();
            while (iterator.hasNext()) {
                if (iterator.next().key == key) {
                    iterator.remove();
                    return;
                }
            }
        }
    }

    private static class Pair {
        int key, value;
        
        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
