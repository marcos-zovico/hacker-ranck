package hackerrank.algorithms.implementation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleAndOrangeTest {

    private static final String IN = """
            7 11
            5 15
            3 2
            -2 2 1
            5 -6""";

    private static final String OUT = """
            1
            1""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> AppleAndOrange.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}