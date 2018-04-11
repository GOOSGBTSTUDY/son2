package auctionsniper;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordCheckerTest {
    @Test
    public void jaum_duplicated_wrong_word() {
        WordChecker wordChecker = new WordChecker("11");

        assertEquals("wrong word", wordChecker.check());
    }

    @Test
    public void moum_duplicated_wrong_word() {
        WordChecker wordChecker = new WordChecker("22");

        assertEquals("wrong word", wordChecker.check());
    }

    @Test
    public void jaum_moum_right_word() {
        WordChecker wordChecker = new WordChecker("12");

        assertEquals("right word", wordChecker.check());
    }

    @Test
    public void moum_jaum_right_word() {
        WordChecker wordChecker = new WordChecker("21");

        assertEquals("right word", wordChecker.check());
    }

    @Test
    public void questionmark_right_word() {
        WordChecker wordChecker = new WordChecker("?");

        assertEquals("right word", wordChecker.check());
    }

    @Test
    public void moum_one_char_right_word() {
        WordChecker wordChecker = new WordChecker("1");

        assertEquals("right word", wordChecker.check());
    }

    @Test
    public void jaum_one_char_right_word() {
        WordChecker wordChecker = new WordChecker("2");

        assertEquals("right word", wordChecker.check());
    }
}