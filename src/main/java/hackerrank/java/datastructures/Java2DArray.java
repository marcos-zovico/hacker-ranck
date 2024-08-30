package hackerrank.java.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Java2DArray {

    public class Solution {
        public static void main(String[] args) throws IOException {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<List<Integer>> arr = new ArrayList<>();

            IntStream.range(0, 6).forEach(i -> {
                try {
                    arr.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();

            int sum = Integer.MIN_VALUE;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int temSum = getHourGlasses(arr, i, j);
                    sum = Math.max(sum, temSum);
                }
            }

            System.out.println(sum);

        }

        private static int getHourGlasses(List<List<Integer>> arr, int i, int j) {
            return sumFistLine(arr, i, j) + sumMiddleLine(arr, i, j) + sumLastLine(arr, i, j);
        }

        private static int sumFistLine(List<List<Integer>> arr, int i, int j) {
            return getPoint(arr, i, j) + getPoint(arr, i, j + 1) + getPoint(arr, i, j + 2);
        }

        private static int sumMiddleLine(List<List<Integer>> arr, int i, int j) {
            return getPoint(arr, i + 1, j + 1);
        }

        private static int sumLastLine(List<List<Integer>> arr, int i, int j) {
            return getPoint(arr, i + 2, j) + getPoint(arr, i + 2, j + 1) + getPoint(arr, i + 2, j + 2);
        }

        private static int getPoint(List<List<Integer>> arr, int i, int j) {
            return arr.get(i).get(j);
        }
    }
}
