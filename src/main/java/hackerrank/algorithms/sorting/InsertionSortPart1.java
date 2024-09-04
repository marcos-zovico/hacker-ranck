package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class InsertionSortPart1 {

    class Result {

        /*
         * Complete the 'insertionSort1' function below.
         *
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER_ARRAY arr
         */

        public static void insertionSort1(int n, List<Integer> arr) {
            Integer rightmost = arr.get(n - 1);

            for (int i = n - 1; i >= 0; i--) {

                int num = i > 0 ? arr.get(i - 1) : arr.get(i);

                if (rightmost < num) {
                    arr.set(i, num);

                    if (i == 0) {
                        arr.set(i, rightmost);
                        printList(arr);
                        break;
                    }
                    printList(arr);
                }

                if (rightmost > num) {
                    arr.set(i, rightmost);
                    printList(arr);
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

            Result.insertionSort1(n, arr);

            bufferedReader.close();
        }
    }
}
