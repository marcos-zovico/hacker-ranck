package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GradingStudents {

    class Result {

        /*
         * Complete the 'gradingStudents' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY grades as parameter.
         */

        public static List<Integer> gradingStudents(List<Integer> grades) {
            return grades.stream()
                    .map(grade -> {
                        if(grade >= 38) {
                            return round(grade);
                        }
                        return grade;
                    }).collect(toList());
        }

        private static Integer round(Integer grade) {
            int roundedGrade = grade;
            int count = 0;

            while(roundedGrade %5 != 0 ) {
                roundedGrade++;
                count++;
            }

            if(count <= 2){
                return roundedGrade;
            }

            return grade;
        }
    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine().replaceAll("\\s+$", "");
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> result = Result.gradingStudents(grades);

            System.out.println(
                    result.stream()
                            .map(Object::toString)
                            .collect(joining("\n"))
                            + "\n"
            );

            bufferedReader.close();
        }
    }
}
