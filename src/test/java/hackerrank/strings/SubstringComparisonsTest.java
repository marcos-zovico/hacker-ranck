package hackerrank.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubstringComparisonsTest {

    @ParameterizedTest
    @CsvSource(
            delimiter = '|',
            value = {"3 | welcometojava | ava wel",
                     "5 | SubstringComparisons | Compa ubstr",
                     "1 | ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkL | A y"}
    )
    void getSmallestAndLargest(int k, String actual, String expected) {
        assertEquals(expected, SubstringComparisons.getSmallestAndLargest(actual, k));
    }
}