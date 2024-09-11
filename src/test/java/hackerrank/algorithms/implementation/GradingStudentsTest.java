package hackerrank.algorithms.implementation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GradingStudentsTest {

    private static final String IN = """
            4
            73
            67
            38
            33""";

    private static final String OUT = """
            75
            67
            40
            33""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> GradingStudents.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }

}