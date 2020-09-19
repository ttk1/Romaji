package net.ttk1.romaji;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DefaultRomajiConverterTest {
    @Test
    public void testConversion() {
        RomajiConverter converter = new DefaultRomajiConverter();
        String romaji = "konnnitiha";
        String expected = "こんにちは";
        String actual = converter.toHiragana(romaji);
        assertThat(actual, is(expected));
    }

    @Test
    public void testSokuonConversion() {
        RomajiConverter converter = new DefaultRomajiConverter();
        String romaji = "acchikocchi";
        String expected = "あっちこっち";
        String actual = converter.toHiragana(romaji);
        assertThat(actual, is(expected));
    }

    @Test
    public void testHatsuonConversion() {
        RomajiConverter converter = new DefaultRomajiConverter();
        String romaji = "konbanha";
        String expected = "こんばんは";
        String actual = converter.toHiragana(romaji);
        assertThat(actual, is(expected));
    }

    @Test
    public void testPartialConversion() {
        RomajiConverter converter = new DefaultRomajiConverter();
        String romaji = "hello, world!";
        String expected = "へっlお, をrld!";
        String actual = converter.toHiragana(romaji);
        assertThat(actual, is(expected));
    }
}
