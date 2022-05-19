package Replace;

public class ReplacSeq3 {
    private static final char[] WHITESPACE_CHARS = { ' ', '\t', '\n', '\f', '\r' };

    public static String collapseWhitespace(String str) {
        StringBuilder result = new StringBuilder();
        char previous = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean whitespace = false;
            for (char w : WHITESPACE_CHARS) {
                if (c != w) {//Modified
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