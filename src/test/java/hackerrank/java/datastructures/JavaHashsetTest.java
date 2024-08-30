package hackerrank.java.datastructures;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaHashsetTest {

    private static final String IN = """
            5
            john tom
            john mary
            john tom
            mary anna
            mary anna""";

    private static final String OUT = """
            1
            2
            2
            3
            3""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaHashset.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}