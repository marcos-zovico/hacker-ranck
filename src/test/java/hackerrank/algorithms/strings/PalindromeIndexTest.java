package hackerrank.algorithms.strings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeIndexTest {

    private static final String IN = """
            3
            aaab
            baa
            aaa""";

    private static final String OUT = """
            3
            0
            -1""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> PalindromeIndex.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}