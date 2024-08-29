package hackerrank.java.advanced;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaLambdaExpressionsTest {

    private static final String IN = """
            5
            1 4
            2 5
            3 898
            1 3
            2 12""";

    private static final String OUT = """
            EVEN
            PRIME
            PALINDROME
            ODD
            COMPOSITE""";

    @BeforeAll
    static void setUp() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaLambdaExpressions.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}