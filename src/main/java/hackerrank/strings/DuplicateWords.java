package hackerrank.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DuplicateWords {

    private static final String REGEX = "\\b(\\w+)(?:\\W+\\1\\b)+";

    public static String removeDuplicateWords(String input) {

        Pattern p = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);

        Matcher m = p.matcher(input);

        while (m.find()) {
            input = input.replaceAll(m.group(), m.group(1));
            System.out.println(m.group() + "-" + m.group(1));
        }

        return input;
    }

    // Driver code
    public static void main(String args[]) {
        // Test Case: 1
        String str1 = "Good bye bye world world";
        System.out.println(removeDuplicateWords(str1));



        // Test Case: 2
        String str2 = "Ram went went to to his home";
        System.out.println(removeDuplicateWords(str2));

        // Test Case: 3
        String str3 = "Hello hello world world";
        System.out.println(removeDuplicateWords(str3));
    }
}
