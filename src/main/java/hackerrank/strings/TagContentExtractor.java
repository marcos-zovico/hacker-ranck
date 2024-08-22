package hackerrank.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    private static final String REGEX = "<(.+)>([^<>]+)</\\1>";
    private static final Pattern pattern = Pattern.compile(REGEX);

    public static String extract(String input) {

        final Matcher matcher = pattern.matcher(input);

        StringBuilder content = new StringBuilder();

        if (!matcher.find()) {
            content.append("None");
        } else {
            content.append(matcher.group(2));
            while (matcher.find()) {
                content.append(" - ").append(matcher.group(2));
            }
        }

        return content.toString();
    }
}
