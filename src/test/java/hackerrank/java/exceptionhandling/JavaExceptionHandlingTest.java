package hackerrank.java.exceptionhandling;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaExceptionHandlingTest {

    private static final String IN = """
            3 5
            2 4
            0 0
            -1 -2
            -1 3""";

    private static final String OUT = """
            243
            16
            java.lang.Exception: n and p should not be zero.
            java.lang.Exception: n or p should not be negative.
            java.lang.Exception: n or p should not be negative.""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaExceptionHandling.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }

}