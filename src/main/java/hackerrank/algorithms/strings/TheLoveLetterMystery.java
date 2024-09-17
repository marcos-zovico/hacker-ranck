package hackerrank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class TheLoveLetterMystery {

    class Result {

        /*
         * Complete the 'theLoveLetterMystery' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts STRING s as parameter.
         */

        public static int theLoveLetterMystery(String s) {
            // Write your code here
            int minOps = 0;
            String reversed = new StringBuilder(s).reverse().toString();

            if (s.equals(reversed)) {
                return minOps;
            }

            for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
                minOps += Math.abs(s.charAt(i) - s.charAt(j));
            }
            return minOps;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int q = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, q).forEach(qItr -> {
                try {
                    String s = bufferedReader.readLine();

                    int result = Result.theLoveLetterMystery(s);

                    System.out.println(result);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
        }
    }
}
