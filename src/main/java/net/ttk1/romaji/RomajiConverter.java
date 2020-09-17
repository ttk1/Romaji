package net.ttk1.romaji;

public interface RomajiConverter {
    /**
     * ローマ字をひらがなに変換する
     * @param romaji 変換元のローマ字文字列
     * @return 変換後のひらがな文字列
     */
    String toHiragana(String romaji);
}
