package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class AppleAndOrange {

    class Result {

        /*
         * Complete the 'countApplesAndOranges' function below.
         *
         * The function accepts following parameters:
         *  1. INTEGER s
         *  2. INTEGER t
         *  3. INTEGER a
         *  4. INTEGER b
         *  5. INTEGER_ARRAY apples
         *  6. INTEGER_ARRAY oranges
         */

        public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
            // Write your code here
            System.out.println(count(s, t, a, apples));
            System.out.println(count(s, t, b, oranges));
        }

        private static long count(int s, int t, int ab, List<Integer> fruits) {
            return fruits.stream()
                    .map(fruit -> ab + fruit)
                    .filter(fruit -> fruit >= s && fruit <= t)
                    .count();
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int s = Integer.parseInt(firstMultipleInput[0]);

            int t = Integer.parseInt(firstMultipleInput[1]);

            String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int a = Integer.parseInt(secondMultipleInput[0]);

            int b = Integer.parseInt(secondMultipleInput[1]);

            String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int m = Integer.parseInt(thirdMultipleInput[0]);

            int n = Integer.parseInt(thirdMultipleInput[1]);

            List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            Result.countApplesAndOranges(s, t, a, b, apples, oranges);

            bufferedReader.close();
        }
    }
}
