package hackerrank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulBinaryString {

    class Result {

        /*
         * Complete the 'beautifulBinaryString' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts STRING b as parameter.
         */

        public static int beautifulBinaryString(String b) {
            int minSteps = 0;

            for (int i = 0; i < b.length(); ) {
                int endIndex = Math.min(i + 3, b.length());
                String sub = b.substring(i, endIndex);
                if ("010".equals(sub)) {
                    minSteps++;
                    i += 3;
                } else {
                    i++;
                }
            }

            return minSteps;
        }
    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String b = bufferedReader.readLine();

            int result = Result.beautifulBinaryString(b);

            System.out.println(result);

            bufferedReader.close();
        }
    }
}
