package hackerrank.java.oop;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaIteratorTest {
    private static final String IN = """
            2 2
            42
            10
            Hello
            Java""";

    private static final String OUT = """
            Hello
            Java""";

    @BeforeAll
    static void setUp() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaIterator.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}