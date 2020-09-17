package net.ttk1.romaji.util;

import java.util.HashMap;
import java.util.Map;

public class Trie<K, V> {
    private final V value;
    private final Map<K, Trie<K, V>> children;

    public Trie(V value) {
        this.value = value;
        children = new HashMap<>();
    }

    public boolean hasKey(K key) {
        return children.containsKey(key);
    }

    public Trie<K, V> getChild(K key) {
        return children.get(key);
    }

    public V getValue() {
        return value;
    }

    public Trie<K, V> createChild(K key, V value) throws KeyAlreadyExistsException {
        if (hasKey(key)) {
            throw new KeyAlreadyExistsException(String.format("Key '%s' already exists.", key));
        }
        Trie<K, V> child = new Trie<>(value);
        children.put(key, child);
        return child;
    }

    public static class KeyAlreadyExistsException extends Exception {
        public KeyAlreadyExistsException(String msg) {
            super(msg);
        }
    }
}