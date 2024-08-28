package hackerrank.java.datastructures;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaListTest {

    private static final String IN = """
            5
            12 0 1 78 12
            2
            Insert
            5 23
            Delete
            0""";

    private static final String OUT = "0 1 78 12 23";


    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(JavaList::runCode);
        assertEquals(OUT, actual.strip());
    }
}