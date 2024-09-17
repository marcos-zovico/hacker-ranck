package hackerrank.algorithms.strings;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AlternatingCharactersTest {

    private static final String IN = """
            5
            AAAA
            BBBBB
            ABABABAB
            BABABA
            AAABBB""";

    private static final String OUT = """
            3
            4
            0
            0
            4""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> AlternatingCharacters.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}