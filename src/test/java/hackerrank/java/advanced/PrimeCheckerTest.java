package hackerrank.java.advanced;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeCheckerTest {

    private static final String IN = """
            2
            1
            3
            4
            5""";

    private static final String OUT = """
            2
            2
            2 3
            2 3 5""";

    @BeforeAll
    static void setUp() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> PrimeChecker.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}