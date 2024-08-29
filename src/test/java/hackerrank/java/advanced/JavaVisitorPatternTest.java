package hackerrank.java.advanced;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaVisitorPatternTest {

    private static final String IN = """
            5
            4 7 2 5 12
            0 1 0 0 1
            1 2
            1 3
            3 4
            3 5""";

    private static final String OUT = """
            24
            40
            15""";

    @BeforeAll
    static void setUp() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaVisitorPattern.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }

}