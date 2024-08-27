package hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    private static final String REGEX = "<(.+)>([^<>]+)</\\1>";
    private static final Pattern pattern = Pattern.compile(REGEX);

    public static void runCode() {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {

            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);

            if (!matcher.find()) {
                System.out.println("None");
            } else {
                System.out.println(matcher.group(2));
                while (matcher.find()) {
                    System.out.println(matcher.group(2));
                }
            }

            testCases--;
        }

        in.close();
    }
}
