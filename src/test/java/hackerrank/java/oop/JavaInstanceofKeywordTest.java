package hackerrank.java.oop;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaInstanceofKeywordTest {

    private static final String IN = """
            5
            Student
            Student
            Rockstar
            Student
            Hacker""";

    private static final String OUT = "3 1 1";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaInstanceofKeyword.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}