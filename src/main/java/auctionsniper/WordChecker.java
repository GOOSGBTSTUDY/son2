package auctionsniper;

public class WordChecker {

    public static final String RIGHT = "right word";
    public static final String WRONG = "wrong word";
    private final String word;

    public WordChecker(String word) {
        this.word = word;
    }

    public String check() {
        if (word.length() == 1) {
            return RIGHT;
        }
        if (word.equals("12")) {
            return RIGHT;
        }
        if (word.equals("21")) {
            return RIGHT;
        }

        return WRONG;
    }
}
