package hackerrank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class PalindromeIndex {

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int q = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, q).forEach(qItr -> {
                try {
                    String s = bufferedReader.readLine();

                    int result = Result.palindromeIndex(s);

                    System.out.println(result);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
        }
    }
}

class Result {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
        int result = -1;
        int length = s.length();

        String reverse = new StringBuilder(s).reverse().toString();

        if (s.equals(reverse)) {
            return result;
        }


        for (int i = 0; i < length; i++) {

            StringBuilder s1 = new StringBuilder(s).deleteCharAt(i);
            StringBuilder s2 = new StringBuilder(s1).reverse();

            if (s1.toString().contentEquals(s2)) {
                return i;
            }
        }

        return result;
    }

}
