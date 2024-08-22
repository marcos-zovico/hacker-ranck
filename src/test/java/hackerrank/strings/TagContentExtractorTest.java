package hackerrank.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TagContentExtractorTest {

    @ParameterizedTest
    @CsvSource(
            delimiter = '|',
            value = {"<h1>Nayeem loves counseling</h1> | Nayeem loves counseling",
                    "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par> | Sanjay has no watch - So wait for a while",
                    "<Amee>safat codes like a ninja</amee> | None",
                    "<SA premium>Imtiaz has a secret crush</SA premium> | Imtiaz has a secret crush"
            }
    )
    void extract(String actual, String expected) {
        assertEquals(expected, TagContentExtractor.extract(actual));
    }
}