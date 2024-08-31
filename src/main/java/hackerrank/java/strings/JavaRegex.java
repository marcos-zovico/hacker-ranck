package hackerrank.java.strings;

import java.util.Scanner;

public class JavaRegex {

    public class Solution {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            while (in.hasNext()) {
                String ip = in.next();
                System.out.println(ip.matches(new MyRegex().pattern));
            }

            in.close();
        }
    }

    private static class MyRegex {

        private static final String ZERO_TO_255 = "(\\d{1,2}|([01])\\" + "d{2}|2[0-4]\\d|25[0-5])";

        public String pattern;

        public MyRegex() {
            this.pattern = ZERO_TO_255 + "\\." + ZERO_TO_255 + "\\." + ZERO_TO_255 + "\\." + ZERO_TO_255;
        }
    }
}