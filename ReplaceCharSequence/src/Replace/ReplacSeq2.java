package Replace;

public class ReplacSeq2 {
    private static final char[] WHITESPACE_CHARS = { ' ', '\t', '\n', '\f', '\r' };

    public static String collapseWhitespace(String str) {
        StringBuilder result = new StringBuilder();
        char previous = 0;
        for (int i = 1; i < str.length(); i++) {//Modified
            char c = str.charAt(i);
            boolean whitespace = false;
            for (char w : WHITESPACE_CHARS) {
                if (c == w) {
                    if (previous != ' ') {
                        result.append(' ');
                    }
                    previous = ' ';
                    whitespace = true;
                    break;
                }
            }
            if (!whitespace) {
                result.append(c);
                previous = c;
            }
        }
        return result.toString();
    }

}