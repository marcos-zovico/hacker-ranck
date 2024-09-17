package hackerrank.algorithms.strings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TheLoveLetterMysteryTest {

    private static final String IN = """
            4
            abc
            abcba
            abcd
            cba""";

    private static final String OUT = """
            2
            0
            4
            2""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> TheLoveLetterMystery.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}