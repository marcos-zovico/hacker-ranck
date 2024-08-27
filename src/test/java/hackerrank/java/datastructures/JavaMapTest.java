package hackerrank.java.datastructures;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaMapTest {

    private static final String IN = """
            3
            uncle sam
            99912222
            tom
            11122222
            harry
            12299933
            uncle sam
            uncle tom
            harry""";

    private static final String OUT = """
            uncle sam=99912222
            Not found
            harry=12299933""";


    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(JavaMap::runCode);
        assertEquals(OUT, actual.strip());
    }

}