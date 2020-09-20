package net.ttk1.romaji;

import net.ttk1.romaji.util.Trie;

public class DefaultRomajiConverter implements RomajiConverter {
    private final Trie<Character, String> dict;

    public DefaultRomajiConverter() {
        dict = new Trie<>(null);

        /////////
        // 記号 //
        /////////

        addRule("-", "ー");
        addRule(",", "、");
        addRule(".", "。");
        addRule(" ", "　");
        addRule("!", "！");
        addRule("?", "？");

        /////////
        // あ行 //
        /////////

        addRule("a", "あ");
        addRule("i", "い");
        addRule("u", "う");
        addRule("e", "え");
        addRule("o", "お");

        // カタカナ混じってるけどルールに含めておく
        addRule("va", "ヴぁ");
        addRule("vi", "ヴぃ");
        addRule("vu", "ヴ");
        addRule("ve", "ヴぇ");
        addRule("vo", "ヴぉ");

        addRule("la", "ぁ");
        addRule("li", "ぃ");
        addRule("lu", "ぅ");
        addRule("le", "ぇ");
        addRule("lo", "ぉ");

        addRule("wha", "うぁ");
        addRule("whi", "うぃ");
        addRule("whu", "う");
        addRule("whe", "うぇ");
        addRule("who", "うぉ");

        /////////
        // か行 //
        /////////

        addRule("ka", "か");
        addRule("ki", "き");
        addRule("ku", "く");
        addRule("ke", "け");
        addRule("ko", "こ");

        addRule("ga", "が");
        addRule("gi", "ぎ");
        addRule("gu", "ぐ");
        addRule("ge", "げ");
        addRule("go", "ご");

        addRule("kya", "きゃ");
        addRule("kyi", "きぃ");
        addRule("kyu", "きゅ");
        addRule("kye", "きぇ");
        addRule("kyo", "きょ");

        addRule("gya", "ぎゃ");
        addRule("gyi", "ぎぃ");
        addRule("gyu", "ぎゅ");
        addRule("gye", "ぎぇ");
        addRule("gyo", "ぎょ");

        addRule("qa", "くぁ");
        addRule("qi", "くぃ");
        addRule("qu", "く");
        addRule("qe", "くぇ");
        addRule("qo", "くぉ");

        addRule("qwa", "くぁ");
        addRule("qwi", "くぃ");
        addRule("qwu", "くぅ");
        addRule("qwe", "くぇ");
        addRule("qwo", "くぉ");

        addRule("qwa", "くぁ");
        addRule("qwi", "くぃ");
        addRule("qwu", "くぅ");
        addRule("qwe", "くぇ");
        addRule("qwo", "くぉ");

        addRule("kwa", "くぁ");

        addRule("gwa", "ぐぁ");
        addRule("gwi", "ぐぃ");
        addRule("gwu", "ぐぅ");
        addRule("gwe", "ぐぇ");
        addRule("gwo", "ぐぉ");

        addRule("qya", "くゃ");
        addRule("qyi", "くぃ");
        addRule("qyu", "くゅ");
        addRule("qye", "くぇ");
        addRule("qyo", "くょ");

        // カタカナ混じってるけどルールに含めておく
        addRule("lka", "ヵ");
        addRule("lke", "ヶ");
        addRule("xka", "ヵ");
        addRule("xke", "ヶ");

        /////////
        // さ行 //
        /////////

        addRule("sa", "さ");
        addRule("si", "し");
        addRule("su", "す");
        addRule("se", "せ");
        addRule("so", "そ");

        addRule("za", "ざ");
        addRule("zi", "じ");
        addRule("zu", "ず");
        addRule("ze", "ぜ");
        addRule("zo", "ぞ");

        addRule("sha", "しゃ");
        addRule("shi", "し");
        addRule("shu", "しゅ");
        addRule("she", "しぇ");
        addRule("sho", "しょ");

        addRule("sya", "しゃ");
        addRule("syi", "しぃ");
        addRule("syu", "しゅ");
        addRule("sye", "しぇ");
        addRule("syo", "しょ");

        addRule("ja", "じゃ");
        addRule("ji", "じ");
        addRule("ju", "じゅ");
        addRule("je", "じぇ");
        addRule("jo", "じょ");

        addRule("jya", "じゃ");
        addRule("jyi", "じぃ");
        addRule("jyu", "じゅ");
        addRule("jye", "じぇ");
        addRule("jyo", "じょ");

        addRule("zya", "じゃ");
        addRule("zyi", "じぃ");
        addRule("zyu", "じゅ");
        addRule("zye", "じぇ");
        addRule("zyo", "じょ");

        addRule("swa", "すぁ");
        addRule("swi", "すぃ");
        addRule("swu", "すぇ");
        addRule("swe", "すぉ");
        addRule("swo", "すぉ");

        /////////
        // た行 //
        /////////

        addRule("ta", "た");
        addRule("ti", "ち");
        addRule("tu", "つ");
        addRule("te", "て");
        addRule("to", "と");

        addRule("da", "だ");
        addRule("di", "ぢ");
        addRule("du", "づ");
        addRule("de", "で");
        addRule("do", "ど");

        addRule("cha", "ちゃ");
        addRule("chi", "ち");
        addRule("chu", "ちゅ");
        addRule("che", "ちぇ");
        addRule("cho", "ちょ");

        addRule("tya", "ちゃ");
        addRule("tyi", "ちぃ");
        addRule("tyu", "ちゅ");
        addRule("tye", "ちぇ");
        addRule("tyo", "ちょ");

        addRule("cya", "ちゃ");
        addRule("cyi", "ちぃ");
        addRule("cyu", "ちゅ");
        addRule("cye", "ちぇ");
        addRule("cyo", "ちょ");

        addRule("dya", "ぢゃ");
        addRule("dyi", "ぢぃ");
        addRule("dyu", "ぢゅ");
        addRule("dye", "ぢぇ");
        addRule("dyo", "ぢょ");

        addRule("tsa", "つぁ");
        addRule("tsi", "つぃ");
        addRule("tsu", "つ");
        addRule("tse", "つぇ");
        addRule("tso", "つぉ");

        addRule("tha", "てゃ");
        addRule("thi", "てぃ");
        addRule("thu", "つ");
        addRule("the", "てぇ");
        addRule("tho", "てょ");

        addRule("dha", "でゃ");
        addRule("dhi", "でぃ");
        addRule("dhu", "でゅ");
        addRule("dhe", "でぇ");
        addRule("dho", "でょ");

        addRule("twa", "とぁ");
        addRule("twi", "とぃ");
        addRule("twu", "とぅ");
        addRule("twe", "とぇ");
        addRule("two", "とぉ");

        addRule("dwa", "どぁ");
        addRule("dwi", "どぃ");
        addRule("dwu", "どぅ");
        addRule("dwe", "どぇ");
        addRule("dwo", "どぉ");

        /////////
        // な行 //
        /////////

        addRule("na", "な");
        addRule("ni", "に");
        addRule("nu", "ぬ");
        addRule("ne", "ね");
        addRule("no", "の");

        addRule("nya", "にゃ");
        addRule("nyi", "にぃ");
        addRule("nyu", "にゅ");
        addRule("nye", "にぇ");
        addRule("nyo", "にょ");

        /////////
        // は行 //
        /////////

        addRule("ha", "は");
        addRule("hi", "ひ");
        addRule("hu", "ふ");
        addRule("he", "へ");
        addRule("ho", "ほ");

        addRule("ba", "ば");
        addRule("bi", "び");
        addRule("bu", "ぶ");
        addRule("be", "べ");
        addRule("bo", "ぼ");

        addRule("ba", "ば");
        addRule("bi", "び");
        addRule("bu", "ぶ");
        addRule("be", "べ");
        addRule("bo", "ぼ");

        addRule("pa", "ぱ");
        addRule("pi", "ぴ");
        addRule("pu", "ぷ");
        addRule("pe", "ぺ");
        addRule("po", "ぽ");

        addRule("hya", "ひゃ");
        addRule("hyi", "ひぃ");
        addRule("hyu", "ひゅ");
        addRule("hye", "ひぇ");
        addRule("hyo", "ひょ");

        addRule("fa", "ふぁ");
        addRule("fi", "ふぃ");
        addRule("fu", "ふ");
        addRule("fe", "ふぇ");
        addRule("fo", "ふぉ");

        addRule("bya", "びゃ");
        addRule("byi", "びぃ");
        addRule("byu", "びゅ");
        addRule("bye", "びぇ");
        addRule("byo", "びょ");

        addRule("pya", "ぴゃ");
        addRule("pyi", "ぴぃ");
        addRule("pyu", "ぴゅ");
        addRule("pye", "ぴぇ");
        addRule("pyo", "ぴょ");

        /////////
        // ま行 //
        /////////

        addRule("ma", "ま");
        addRule("mi", "み");
        addRule("mu", "む");
        addRule("me", "め");
        addRule("mo", "も");

        addRule("mya", "みゃ");
        addRule("myi", "みぃ");
        addRule("myu", "みゅ");
        addRule("mye", "みぇ");
        addRule("myo", "みょ");

        /////////
        // ら行 //
        /////////

        addRule("ra", "ら");
        addRule("ri", "り");
        addRule("ru", "る");
        addRule("re", "れ");
        addRule("ro", "ろ");

        addRule("rya", "りゃ");
        addRule("ryi", "りぃ");
        addRule("ryu", "りゅ");
        addRule("rye", "りぇ");
        addRule("ryo", "りょ");

        /////////
        // や行 //
        /////////

        addRule("ya", "や");
        addRule("yu", "ゆ");
        addRule("yo", "よ");

        /////////
        // わ行 //
        /////////

        addRule("wa", "わ");
        addRule("wi", "うぃ");
        addRule("wu", "う");
        addRule("we", "うぇ");
        addRule("wo", "を");

        ///////////
        // その他 //
        ///////////

        addRule("nn", "ん");

        addRule("lya", "ゃ");
        addRule("lyu", "ゅ");
        addRule("lyo", "ょ");
        addRule("lwa", "ゎ");
        addRule("ltu", "っ");
        addRule("ltsu", "っ");

        addRule("xya", "ゃ");
        addRule("xyu", "ゅ");
        addRule("xyo", "ょ");
        addRule("xwa", "ゎ");
        addRule("xtu", "っ");
        addRule("xtsu", "っ");

        addRule("ca", "か");
        addRule("ci", "し");
        addRule("cu", "く");
        addRule("ce", "せ");
        addRule("co", "こ");
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
                ++j;
            } else {
                String value = current.getValue();
                if (value != null) {
                    hiragana.append(value);
                    i = j;
                } else {
                    if (key.toString().getBytes().length == 1 // マルチバイト文字は対象外とする
                            && i + 1 < romaji.length()
                            && romaji.charAt(i) == romaji.charAt(i + 1)) {
                        // 促音
                        hiragana.append('っ');
                    } else if (romaji.charAt(i) == 'n') {
                        // 撥音
                        hiragana.append('ん');
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
