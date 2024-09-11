package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class BigSort {

    class Result {

        /*
         * Complete the 'bigSorting' function below.
         *
         * The function is expected to return a STRING_ARRAY.
         * The function accepts STRING_ARRAY unsorted as parameter.
         */


        public static List<String> bigSorting(List<String> unsorted) {
            return unsorted.stream()
                    .sorted((s1, s2) -> {
                        if (s1.length() == s2.length()) {
                            return new BigInteger(s1).compareTo(new BigInteger(s2));
                        }
                        return s1.length() - s2.length();
                    }).collect(toList());
        }
    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> unsorted = IntStream.range(0, n).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .collect(toList());

            List<String> result = Result.bigSorting(unsorted);

            System.out.println(String.join("\n", result));

            bufferedReader.close();
        }
    }
}
