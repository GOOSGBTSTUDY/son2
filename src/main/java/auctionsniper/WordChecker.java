package auctionsniper;

public class WordChecker {

    public static final String RIGHT = "right word";
    public static final String WRONG = "wrong word";
    public static final String UNKNOWN = "unknown word";
    private final String word;

    public WordChecker(String word) {
        this.word = word;
    }

    public String check() {

        if (word.length() == 1) {
            return RIGHT;
        }

        String currentStatus = word.charAt(0) == '?' ? UNKNOWN : RIGHT;

        for (int i = 1; i < word.length(); i++) {
            char prev = word.charAt(i - 1);
            final char cur = word.charAt(i);

            if (prev == cur) return WRONG;

            if (cur != '?') continue;

            if (i + 1 == word.length()) return UNKNOWN;

            char next = word.charAt(i + 1);

            if (prev == next)  {
                currentStatus = UNKNOWN;
            } else {
                return WRONG;
            }
        }

        return currentStatus;
    }
}
