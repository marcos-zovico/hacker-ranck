package hackerrank.algorithms.warmup;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolveMeFirstTest {

    private static final String IN = """
            a = 2
            b = 3""";

    private static final String OUT = "5";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> SolveMeFirst.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }

}