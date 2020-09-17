package net.ttk1.romaji;

import net.ttk1.romaji.util.Trie;

public class DefaultRomajiConverter implements RomajiConverter {
    private final Trie<Character, String> dict;

    public DefaultRomajiConverter() {
        dict = new Trie<>(null);

        addRule("a", "あ");
        addRule("i", "い");
        addRule("u", "う");
        addRule("e", "え");
        addRule("o", "お");

        addRule("ka", "か");
        addRule("ki", "き");
        addRule("ku", "く");
        addRule("ke", "け");
        addRule("ko", "こ");

        addRule("sa", "さ");
        addRule("si", "し");
        addRule("su", "す");
        addRule("se", "せ");
        addRule("so", "そ");

        addRule("ta", "た");
        addRule("ti", "ち");
        addRule("tu", "つ");
        addRule("te", "て");
        addRule("to", "と");

        addRule("na", "な");
        addRule("ni", "に");
        addRule("nu", "ぬ");
        addRule("ne", "ね");
        addRule("no", "の");

        addRule("ha", "は");
        addRule("hi", "ひ");
        addRule("hu", "ふ");
        addRule("he", "へ");
        addRule("ho", "ほ");

        addRule("ma", "ま");
        addRule("mi", "み");
        addRule("mu", "む");
        addRule("me", "め");
        addRule("mo", "も");

        addRule("ya", "や");
        addRule("yu", "ゆ");
        addRule("yo", "よ");

        addRule("wa", "わ");
        addRule("wo", "を");
        addRule("nn", "ん");
    }

    private void addRule(String spell, String hiragana) {
        try {
            Trie<Character, String> current = dict;
            for (int i = 0; i < spell.length(); i++) {
                Character key = spell.charAt(i);
                if (current.hasKey(key)) {
                    current = current.getChild(key);
                } else if (i == spell.length() - 1) {
                    current = current.createChild(key, hiragana);
                } else {
                    current = current.createChild(key, null);
                }
            }
        } catch (Trie.KeyAlreadyExistsException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toHiragana(String romaji) {
        StringBuilder hiragana = new StringBuilder();
        Trie<Character, String> current = dict;
        int i = 0, j = 0;
        while (j < romaji.length()) {
            Character key = romaji.charAt(j);
            Trie<Character, String> child = current.getChild(key);
            if (child != null) {
                current = child;
                j++;
            } else {
                String value = current.getValue();
                if (value != null) {
                    hiragana.append(value);
                    i = j;
                } else {
                    if (i != j && romaji.charAt(i) == romaji.charAt(i + 1)) {
                        hiragana.append('っ');
                    } else {
                        hiragana.append(romaji.charAt(i));
                    }
                    j = ++i;
                }
                current = dict;
            }
        }
        String value = current.getValue();
        if (value != null) {
            hiragana.append(value);
        } else {
            hiragana.append(romaji.substring(i));
        }
        return hiragana.toString();
    }
}
