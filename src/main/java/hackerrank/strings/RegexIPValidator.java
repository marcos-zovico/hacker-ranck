package hackerrank.strings;

public class RegexIPValidator {

    public static boolean matches(String ip) {
        return ip.matches(new MyRegex().pattern);
    }

    private static class MyRegex {

        private static final String ZERO_TO_255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

        public String pattern;

        public MyRegex() {
            this.pattern = ZERO_TO_255 + "\\." + ZERO_TO_255 + "\\." + ZERO_TO_255 + "\\." + ZERO_TO_255;
        }
    }
}