package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class InsertionSortPart2 {

    class Result {

        /*
         * Complete the 'insertionSort2' function below.
         *
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER_ARRAY arr
         */

        public static void insertionSort2(int n, List<Integer> arr) {
            for (int i = 1; i < n; i++) {
                sort(i, arr);
                printList(arr);
            }
        }

        private static void sort(int n, List<Integer> arr) {
            Integer rightmost = arr.get(n);

            for (int i = n; i >= 0; i--) {
                int num = i > 0 ? arr.get(i - 1) : arr.get(i);
                if (rightmost < num) {
                    arr.set(i, num);
                    arr.set(i - 1, rightmost);
                }

                if (rightmost > num) {
                    arr.set(i, rightmost);
                    arr.set(i - 1, num);
                    break;
                }
            }
        }

        private static void printList(List<Integer> list) {
            List<String> elements = list.stream().map(String::valueOf).collect(toList());
            System.out.println(String.join(" ", elements));
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            Result.insertionSort2(n, arr);

            bufferedReader.close();
        }
    }
}
