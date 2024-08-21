package hackerrank.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateWordsTest {

    @ParameterizedTest
    @CsvSource(
            delimiter = '|',
            value = {"Goodbye bye bye world world world | Goodbye bye world",
                     "Sam went went to to to his business | Sam went to his business",
                     "Reya is is the the best player in eye eye game | Reya is the best player in eye game",
                     "in inthe | in inthe",
                     "Hello hello Ab aB | Hello Ab"}
    )
    void removeDuplicateWords(String actual, String expected) {
        assertEquals(expected, DuplicateWords.removeDuplicateWords(actual));
    }
}