package hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class JavaRegex2DuplicateWords {

    private static final String REGEX = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";

    private static final Pattern PATTERN = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);

    public static void runCode() {

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = PATTERN.matcher(input);

            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            System.out.println(input);
        }

        in.close();
    }
}
