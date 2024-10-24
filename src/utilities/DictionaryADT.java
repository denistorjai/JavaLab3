package utilities;

/**
 * DictionaryADT.java
 *
 * @author your name
 * @version major.minor revision number starting at 1.0
 *
 * Class Definition: This interface represents the public contract for the
 * implementation of Dictionary for the DictionaryADT Lab.
 */

public interface DictionaryADT<K,V> {

    void insert (K key, V value);
    void remove (K key);
    void update (K key, V value);
    V Lookup (K key);

}
