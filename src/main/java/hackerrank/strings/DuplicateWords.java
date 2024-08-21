package hackerrank.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DuplicateWords {

    private static final String REGEX = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";

    public static String removeDuplicateWords(String input) {

        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher(input);

        while (m.find()) {
            input = input.replaceAll(m.group(), m.group(1));
        }

        return input;
    }
}
