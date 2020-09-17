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
}
