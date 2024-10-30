package implementations;

import exceptions.DuplicateKeyException;
import utilities.DictionaryADT;
import java.util.ArrayList;

public class Dictionary<K,V> implements DictionaryADT<K,V> {

    // constant
    private static final int DEFAULT_SIZE = 10;

    // index indicates pairing, e.g. keys[1] is stored at values[1]
    private final ArrayList<K> keys;
    private final ArrayList<V> values;

    // Hold Data
    public Dictionary() {
        this.keys = new ArrayList<K>(DEFAULT_SIZE);
        this.values = new ArrayList<V>(DEFAULT_SIZE);
    }

    @Override
    public void create(int size) {

    }

    @Override
    // Insert Key, First check if Key Already exists, if exists then don't add to Dictionary
    public boolean insert(K key, V value) throws DuplicateKeyException {
        if (this.keys.contains(key)) {
            throw new DuplicateKeyException("Key already exists in the dictionary");
        } else {
            this.keys.add(key);
            this.values.add(value);
            return true;
        }
    }

    @Override
    // Remove Key, Check if Key exists, then remove if they do
    public V remove(K key) {
        if (this.keys.contains(key)) {
            int index = this.keys.indexOf(key);
            this.keys.remove(index);
            V value = this.values.get(index);
            this.values.remove(index);
            return value;
        }
        return null;
    }

    @Override
    // Update Key, check if Key exists, get index of key, and update value based off of index
    public boolean update(K key, V value) {
        if (this.keys.contains(key)) {
            int index = this.keys.indexOf(key);
            this.values.set(index, value);
            return true;
        }
        return false;
    }

    @Override
    public V lookup(K key) {
        if (this.keys.contains(key)) {
            int index = this.keys.indexOf(key);
            return this.values.get(index);
        }
        return null;
    }

    @Override
    public V Lookup(K key) {
        return null;
    }

}


