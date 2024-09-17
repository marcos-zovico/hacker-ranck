package hackerrank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class AlternatingCharacters {

    class Result {

        /*
         * Complete the 'alternatingCharacters' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts STRING s as parameter.
         */

        public static int alternatingCharacters(String s) {
            // Write your code here

            char[] charArray = s.toCharArray();
            char last = '\u0000';
            int count = 0;

            for (char c : charArray) {
                if(last == c){
                    count++;
                }

                last = c ;
            }

            return count;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int q = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, q).forEach(qItr -> {
                try {
                    String s = bufferedReader.readLine();

                    int result = Result.alternatingCharacters(s);

                    System.out.println(result);

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
        }
    }
}
