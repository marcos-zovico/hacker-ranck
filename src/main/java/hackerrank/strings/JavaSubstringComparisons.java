package hackerrank.strings;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static void runCode() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    private static String getSmallestAndLargest(String s, int k) {

        int length = s.length() - k + 1;
        String smallest = s.substring(0, k);
        String largest = smallest;

        for (int i = 0; i < length; i++) {
            int endIndex = (k + i);
            String sub = s.substring(i, endIndex);

            if (smallest.compareTo(sub) > 0) {
                smallest = sub;
            }

            if (largest.compareTo(sub) < 0) {
                largest = sub;
            }
        }

        return  smallest + "\n" + largest;
    }
}
