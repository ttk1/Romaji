package net.ttk1.romaji;

public class Romaji {
    public static RomajiConverter getConverter() {
        return new DefaultRomajiConverter();
    }
}
