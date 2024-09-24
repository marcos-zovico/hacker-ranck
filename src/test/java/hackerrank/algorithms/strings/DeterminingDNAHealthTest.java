package hackerrank.algorithms.strings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DeterminingDNAHealthTest {

    private static final String IN = """
            6
            a b c aa d b
            1 2 3 4 5 6
            3
            1 5 caaab
            0 4 xyz
            2 4 bcdybc""";

    private static final String OUT = "0 19";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> DeterminingDNAHealth.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}