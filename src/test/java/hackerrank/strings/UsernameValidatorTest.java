package hackerrank.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UsernameValidatorTest {

    @ParameterizedTest
    @CsvSource(
            delimiter = '|',
            value = {"Invalid | Julia",
                    "Valid   | Samantha",
                    "Valid   | Samantha_21",
                    "Invalid | 1Samantha",
                    "Invalid | Samantha?10_2A",
                    "Valid   | JuliaZ007",
                    "Invalid | Julia@007",
                    "Invalid | _Julia007"
            }
    )
    void matches(String expected, String userName) {
        assertEquals(expected, UsernameValidator.matches(userName));
    }
}