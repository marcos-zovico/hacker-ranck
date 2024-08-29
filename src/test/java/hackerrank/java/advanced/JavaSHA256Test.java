package hackerrank.java.advanced;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaSHA256Test {

    private static final String IN = "HelloWorld";

    private static final String OUT = "872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4";

    @BeforeAll
    static void setUp() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaSHA256.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}