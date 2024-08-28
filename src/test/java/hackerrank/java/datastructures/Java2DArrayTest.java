package hackerrank.java.datastructures;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Java2DArrayTest {

    private static final String IN = """
            0 -4 -6 0 -7 -6
            -1 -2 -6 -8 -3 -1
            -8 -4 -2 -8 -8 -6
            -3 -1 -2 -5 -7 -4
            -3 -5 -3 -6 -6 -6
            -3 -6 0 -8 -6 -7""";

    private static final String OUT = "-19";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(Java2DArray::runCode);
        assertEquals(OUT, actual.strip());
    }
}