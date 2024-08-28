package hackerrank.java.datastructures;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaBitSetTest {

    private static final String IN = """
            5 4
            AND 1 2
            SET 1 4
            FLIP 2 2
            OR 2 1""";

    private static final String OUT = """
            0 0
            1 0
            1 1
            1 2""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(JavaBitSet::runCode);
        assertEquals(OUT, actual.strip());
    }

}