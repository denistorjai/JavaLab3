package implementations;

import utilities.DictionaryADT;
import java.util.ArrayList;

public class Dictionary<K,V> implements DictionaryADT<K,V> {

    // constant
    private static final int DEFAULT_SIZE = 10;

    // index indicates pairing, e.g. keys[1] is stored at values[1]
    private ArrayList<K> keys;
    private ArrayList<V> values;

    // Hold Data
    public Dictionary() {
        this.keys = new ArrayList<K>(DEFAULT_SIZE);
        this.values = new ArrayList<V>(DEFAULT_SIZE);
    }

    @Override
    // Insert Key, First check if Key Already exists, if exists then don't add to Dictionary
    public void insert(K key, V value) {
        if (this.keys.contains(key)) {
            System.out.println("Key " + key + " already exists");
        } else {
            this.keys.add(key);
            this.values.add(value);
        }
    }

    @Override
    // Remove Key, Check if Key exists, then remove if they do
    public void remove(K key) {
        if (this.keys.contains(key)) {
            int index = this.keys.indexOf(key);
            this.keys.remove(index);
            this.values.remove(index);
        }
    }

    @Override
    // Update Key, check if Key exists, get index of key, and update value based off of index
    public void update(K key, V value) {
        if (this.keys.contains(key)) {
            int index = this.keys.indexOf(key);
            this.values.set(index, value);
        }
    }

    @Override
    // Lookup
    public V Lookup(K key) {
        if (this.keys.contains(key)) {
            int index = this.keys.indexOf(key);
            return this.values.get(index);
        }
        return null;
    }

}


