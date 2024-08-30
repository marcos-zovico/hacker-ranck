package hackerrank.java.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIfElse {

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(reader.readLine().trim());

            boolean isOdd = N % 2 != 0;
            boolean isGth_20 = N > 20;
            boolean isBtw_2_5 = N >= 2 && N <= 5;
            boolean isBtw_6_20 = N >= 6 && N <= 20;

            if (isOdd) {
                System.out.println("Weird");
            } else if (isBtw_2_5) {
                System.out.println("Not Weird");
            } else if (isBtw_6_20) {
                System.out.println("Weird");
            } else if (isGth_20) {
                System.out.println("Not Weird");
            }

            reader.close();
        }
    }
}
