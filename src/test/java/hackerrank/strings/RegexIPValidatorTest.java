package hackerrank.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegexIPValidatorTest {

    @ParameterizedTest
    @CsvSource(
            delimiter = '|',
            value = {"true | 000.12.12.034",
                     "true | 121.234.12.12",
                     "true | 23.45.12.56",
                     "false | 00.12.123.123123.123",
                     "false | 122.23",
                     "false | Hello.IP"}
    )
    void matches(boolean expected, String ip) {
        assertEquals(expected, RegexIPValidator.matches(ip));
    }
}