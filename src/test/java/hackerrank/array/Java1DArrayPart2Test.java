package hackerrank.array;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Java1DArrayPart2Test {

    private static final String IN = """
            4
            5 3
            0 0 0 0 0
            6 5
            0 0 0 1 1 1
            6 3
            0 0 1 1 1 0
            3 1
            0 1 0""";

    private static final String OUT = """
            YES
            YES
            NO
            NO""";

    @BeforeAll
    static void setUp() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(Java1DArrayPart2::runCode);
        assertEquals(OUT, actual.strip());
    }
}
