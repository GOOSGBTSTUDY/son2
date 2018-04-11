package auctionsniper;

import org.junit.Test;

import static auctionsniper.WordChecker.*;
import static org.junit.Assert.assertEquals;

public class WordCheckerTest {
    @Test
    public void jaum_duplicated_wrong_word() {
        WordChecker wordChecker = new WordChecker("11");

        assertEquals(WRONG, wordChecker.check());
    }

    @Test
    public void moum_duplicated_wrong_word() {
        WordChecker wordChecker = new WordChecker("22");

        assertEquals(WRONG, wordChecker.check());
    }

    @Test
    public void jaum_moum_right_word() {
        WordChecker wordChecker = new WordChecker("12");

        assertEquals(RIGHT, wordChecker.check());
    }

    @Test
    public void moum_jaum_right_word() {
        WordChecker wordChecker = new WordChecker("21");

        assertEquals(RIGHT, wordChecker.check());
    }

    @Test
    public void questionmark_right_word() {
        WordChecker wordChecker = new WordChecker("?");

        assertEquals(RIGHT, wordChecker.check());
    }

    @Test
    public void moum_one_char_right_word() {
        WordChecker wordChecker = new WordChecker("1");

        assertEquals(RIGHT, wordChecker.check());
    }

    @Test
    public void jaum_one_char_right_word() {
        WordChecker wordChecker = new WordChecker("2");

        assertEquals(RIGHT, wordChecker.check());
    }

    @Test
    public void jaum_q_jaum_unknown_word() {
        WordChecker wordChecker = new WordChecker("1?1");

        assertEquals(UNKNOWN, wordChecker.check());
    }

    @Test
    public void jaum_q_jaum_jaum_wrong_word() {
        WordChecker wordChecker = new WordChecker("1?11");

        assertEquals(WRONG, wordChecker.check());
    }

    @Test
    public void jaum_moum_jaum_right_word() {
        final WordChecker wordChecker = new WordChecker("121");

        assertEquals(RIGHT, wordChecker.check());
    }

    @Test
    public void last_q_unknown_word() {
        final WordChecker wordChecker = new WordChecker("1212?");

        assertEquals(UNKNOWN, wordChecker.check());
    }

    @Test
    public void q_with_jaum_moum_unknown_word() {
        final WordChecker wordChecker = new WordChecker("?12");

        assertEquals(UNKNOWN, wordChecker.check());
    }


    @Test
    public void jaum_moum_q_with_jaum_moum_unknown_word() {
        final WordChecker wordChecker = new WordChecker("12?12");

        assertEquals(WRONG, wordChecker.check());
    }

}