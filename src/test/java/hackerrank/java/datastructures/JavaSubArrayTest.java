package hackerrank.java.datastructures;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class JavaSubArrayTest {

    private static final String IN = """
            5
            1 -2 4 -5 1""";

    private static final String OUT = "9";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaSubArray.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}