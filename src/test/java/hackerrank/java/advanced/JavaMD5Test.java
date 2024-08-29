package hackerrank.java.advanced;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaMD5Test {

    private static final String IN = "HelloWorld";

    private static final String OUT = "68e109f0f40ca72a15e05cc22786f8e6";

    @BeforeAll
    static void setUp() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaMD5.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}