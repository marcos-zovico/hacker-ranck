package hackerrank.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NegativeSubArraysTest {

    @ParameterizedTest
    @CsvSource(
            delimiter = '|',
            value = {"9 | 1,-2,4,-5,1",
                     "6 | -1,-2,-3",
                     "0 | 1,2,3",
                     "1 | -100",
                     "0 | 100"}
    )
    void countNegativeSubArrays(int expected, String array) {
        assertEquals(expected, NegativeSubArrays.countNegativeSubArrays(toArray(array)));
    }

    private static Integer[] toArray(String array) {
         return Stream.of(array.split(","))
                .map(Integer::valueOf)
                .toArray(Integer[]::new);
    }

}